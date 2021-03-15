package iilibxc.strategy.optimize;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;


/**
 * 版本一：工厂使用
 */
public class UserPayServiceStrategyFactory2 {

    private static Map<String,UserPayService> services = new ConcurrentHashMap<String,UserPayService>();

    public  static UserPayService getByUserType(String type){
        return services.get(type);
    }

    static{
        services.put(UserPayServiceEnum.VIP.getValue(), new VipPayService());
        services.put(UserPayServiceEnum.SUPERVIP.getValue(), new SuperVipPayService());
        services.put(UserPayServiceEnum.PARTICULALYVIP.getValue(), new ParticularlyVipPayService());
        services.put(UserPayServiceEnum.NORMAL.getValue(), new NormalPayService());
    }



}

