package iilibxc.strategy.optimize;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

@SpringBootTest
@Slf4j
class IfElseApplicationTests {

    @Test
    void contextLoads() {
        calPrice();
    }

    public  void calPrice() {
        BigDecimal orderPrice = new BigDecimal("100");
        String vipType = "Vip";
        //指定用户类型，获得相对应的策略
        UserPayService strategy = UserPayServiceStrategyFactory.getByUserType(vipType);

//        UserPayService strategy2 = UserPayServiceStrategyFactory2.getByUserType(vipType);

        System.out.println(strategy);
//        System.out.println(strategy2);
        BigDecimal quote = strategy.quote(orderPrice);
        if(strategy instanceof VipPayService){
            ((VipPayService) strategy).myShow();
        }
        System.out.println(quote);
    }

}
