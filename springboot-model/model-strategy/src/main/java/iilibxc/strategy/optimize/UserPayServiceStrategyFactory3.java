package iilibxc.strategy.optimize;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;


/**
 * 版本一：工厂使用
 */
public class UserPayServiceStrategyFactory3 {

    private static Map<String, Class<? extends UserPayService>> services = new ConcurrentHashMap<>();

    //初始化map，存放策略
    static {
        services.put(UserPayServiceEnum.VIP.getValue(), VipPayService.class);
        services.put(UserPayServiceEnum.SUPERVIP.getValue(), SuperVipPayService.class);
        services.put(UserPayServiceEnum.PARTICULALYVIP.getValue(), ParticularlyVipPayService.class);
        services.put(UserPayServiceEnum.NORMAL.getValue(), NormalPayService.class);
    }

    //获取策略
    public static UserPayService getByUserType(String type) {
        try {
            Class<? extends UserPayService> userPayServiceClass = services.get(type);
            return userPayServiceClass.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
            return new NormalPayService();
        }

    }

}

