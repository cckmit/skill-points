package iilibxc.strategy.optimize;


import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * 超级会员打8折
 */
@Service
public class SuperVipPayService implements UserPayService , InitializingBean {
    @Override
    public BigDecimal quote(BigDecimal orderPrice) {
        Collection<String> c = Collections.unmodifiableCollection(new ArrayList<>());
        return new BigDecimal("8");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        UserPayServiceStrategyFactory.register(UserPayServiceEnum.SUPERVIP.getValue(),this);
    }
}
