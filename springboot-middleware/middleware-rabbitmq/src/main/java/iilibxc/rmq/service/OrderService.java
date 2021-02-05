package iilibxc.rmq.service;

import org.springframework.amqp.rabbit.connection.CorrelationData;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class OrderService {
    @Value("${order.i_fanout_exchange}")
    private String I_FANOUT_EXCHANGE;
    @Value("${order.i_direct_exchange}")
    private String I_DIRECT_EXCHANGE;
    @Value("${order.i_direct_routing}")
    private String I_DIRECT_ROUTING;

    @Autowired
    RabbitTemplate template;

    public void createOrder() {

        String content = ((int) (Math.random() * 1000)) + "用户下单";
        CorrelationData correlationData = new CorrelationData(UUID.randomUUID().toString());
        template.convertAndSend(I_FANOUT_EXCHANGE, "", content);//消息通知，这里不需要设置路由
        template.convertAndSend(I_DIRECT_EXCHANGE, I_DIRECT_ROUTING, content, correlationData);//消息通知
    }
}
