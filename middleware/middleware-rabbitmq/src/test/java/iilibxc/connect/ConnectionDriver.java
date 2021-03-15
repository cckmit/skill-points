package iilibxc.connect;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.sql.Connection;
import java.util.concurrent.TimeUnit;

public class ConnectionDriver {
    static class ConnectionHandler implements InvocationHandler {
        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            if(method.getName().equals("commit")){
                //TimeUnit用于通知基于时间的方法用什么方式计数
                TimeUnit.MICROSECONDS.sleep(100);
            }
            return null;
        }

    }
    public static  final Connection createConnection(){
        //使用动态代理返回Connection，其中ConectionDriver相当于实现类（但不是），Connection被代理的接口，ConnectionHandler代理类
        return (Connection) Proxy.newProxyInstance(ConnectionDriver.class.getClassLoader(),new Class[]{Connection.class},new ConnectionHandler());
    }

}