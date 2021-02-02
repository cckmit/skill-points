package iilibxc.connect;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;

/**
 *数据库线程连接测试类，
 */
public class ConnectionPoolTest {
    static ConnectionPool pool = new ConnectionPool(10);

    static CountDownLatch start = new CountDownLatch(1);
    //保证与初始化的线程数一直,若比线程数小，main线程则会被提前唤醒
    static CountDownLatch end = new CountDownLatch(100);

    public static void main(String[] args) throws InterruptedException{
        int threadCount=100;
        //使用Atomic前缀的类型保证线程安全
        //获取等待了连接的数量
        AtomicInteger got=new AtomicInteger();
        //超时未得到连接的数量
        AtomicInteger nogot=new AtomicInteger();
        for(int i=0;i<threadCount;i++){
            new Thread(new ConnectionRunner(20,got,nogot),"Thread"+i).start();
        }
        start.countDown();
        //等线程都完成了才继续main后续的动作
        end.await();
        System.out.println("got:"+got.get()+"_"+"nogot:"+nogot.get());
    }
    public static class ConnectionRunner implements Runnable{
        private int count;
        private AtomicInteger got;
        private AtomicInteger nogot;

        public ConnectionRunner(int count, AtomicInteger got, AtomicInteger nogot) {
            this.count = count;
            this.got = got;
            this.nogot = nogot;
        }

        public void run() {
            //保证线程同时初始化完成后才开始一起获取资源
            try {
                start.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            while (count>0){
                try {
                    Connection connection=pool.fetchConnection(100);
                    if(connection!=null){
                        try {
                            connection.commit();
                        } catch (SQLException e) {
                            e.printStackTrace();
                        } finally {
                            pool.releaseConnection(connection);
                            got.incrementAndGet();
                        }
                    }else {
                        nogot.incrementAndGet();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }finally {
                    count--;
                }
            }
            end.countDown();
        }
    }
}

