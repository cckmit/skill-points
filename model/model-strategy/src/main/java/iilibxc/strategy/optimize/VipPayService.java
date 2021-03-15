package iilibxc.strategy.optimize;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

/**
 * 普通会员打9折，消费超100打8折
 */

//实现InitializingBean接口，容器启动后会调用afterPropertiesSet()方法，往工厂里写入打折策略
@Service
public class VipPayService implements UserPayService, InitializingBean {
    @Override
    public BigDecimal quote(BigDecimal orderPrice) {
        if (orderPrice.compareTo(new BigDecimal("100")) > 1) {
            return new BigDecimal("8");
        }
        return new BigDecimal("9");
    }

    public void myShow(){
        System.out.println("myShow method invoke----->");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        UserPayServiceStrategyFactory.register(UserPayServiceEnum.VIP.getValue(), this);
    }

}

