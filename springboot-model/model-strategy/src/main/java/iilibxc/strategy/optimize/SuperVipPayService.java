package iilibxc.strategy.optimize;


import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

/**
 * 超级会员打8折
 */
@Service
public class SuperVipPayService implements UserPayService , InitializingBean {
    @Override
    public BigDecimal quote(BigDecimal orderPrice) {
        return new BigDecimal("8");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        UserPayServiceStrategyFactory.register(UserPayServiceEnum.SUPERVIP.getValue(),this);
    }
}
