package iilibxc.rmq.service;

import org.springframework.amqp.rabbit.connection.CorrelationData;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class OrderService {
    @Value("${order.queue_name}")
    private String ORDER_QUEUE_NAME;
    @Value("${order.exchange_name}")
    private String ORDER_EXCHANGE_NAME;
    @Value("${order.routing_key_name}")
    private String ORDER_ROUTING_KEY_NAME;

    @Autowired
    RabbitTemplate template;

    public void createOrder() {
        /**用户下单逻辑。。。。。。**/

        /**用户下单逻辑。。。。。。**/
        String content = "用户下单";
        CorrelationData correlationData = new CorrelationData(UUID.randomUUID().toString());
        template.convertAndSend(ORDER_EXCHANGE_NAME, ORDER_ROUTING_KEY_NAME, content, correlationData);//消息通知
    }
}
