package iilibxc.strategy.optimize;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

/**
 * 普通会员不打折原价
 */

//实现InitializingBean接口，容器启动后会调用afterPropertiesSet()方法，往工厂里写入打折策略
@Service
public class NormalPayService implements UserPayService, InitializingBean {
    @Override
    public BigDecimal quote(BigDecimal orderPrice) {
        return new BigDecimal("10");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        UserPayServiceStrategyFactory.register(UserPayServiceEnum.NORMAL.getValue(), this);
    }

}
