package iilibxc.connect;

import java.sql.Connection;
import java.util.LinkedList;

public class ConnectionPool {
    private LinkedList<Connection> pool=new LinkedList<Connection>();

    /**
     * 初始化线程数量
     * @param initialSize
     */
    public ConnectionPool(int initialSize){
        if(initialSize>0){
            for(int i=0;i<initialSize;i++){
                pool.addLast(ConnectionDriver.createConnection());
            }
        }
    }

    /**
     * 释放连接
     * @param connection
     */
    public  void releaseConnection(Connection connection){
        if(connection!=null){
            synchronized(pool){
                pool.addLast(connection);
                pool.notifyAll();
            }
        }
    }

    /**
     * 在抓取连接的时候，检验是否超时连接
     * @param mills
     * @return
     * @throws InterruptedException
     */
    public Connection fetchConnection(int mills) throws InterruptedException{
        synchronized (pool){
            //完全超时
            if(mills<=0){
                while (pool.isEmpty()){
                    pool.wait();
                }
                //removeFirst()移除并返回第一元素
                return pool.removeFirst();
            }else{
                long future=System.currentTimeMillis()+mills;
                long remaining=mills;
                while(pool.isEmpty()&&remaining>0){
                    pool.wait(remaining);
                    remaining=future-System.currentTimeMillis();
                }
                Connection connection=null;
                if(!pool.isEmpty()){
                    connection=pool.removeFirst();
                }

                return connection;
            }
        }
    }
}

