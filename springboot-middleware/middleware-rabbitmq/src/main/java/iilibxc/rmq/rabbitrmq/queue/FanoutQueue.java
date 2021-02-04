package iilibxc.rmq.rabbitrmq.queue;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.FanoutExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FanoutQueue {
    @Value("${order.queue_name2}")
    private String ORDER_QUEUE_NAME2;
    @Value("${order.exchange_name}")
    private String ORDER_EXCHANGE_NAME;
    @Value("${order.routing_key_name}")
    private String ORDER_ROUTING_KEY_NAME;

    @Bean
    public FanoutExchange fanoutExchange() {
        return new FanoutExchange(ORDER_EXCHANGE_NAME, true, false);
    }

    @Bean
    public Queue orderQueue2() {
        //第二个队列名称自行定义，这里只是做一个示范
        return new Queue(ORDER_QUEUE_NAME2, true);
    }

    @Bean
    public Binding orderBinging() {
        //将队列和交换器进行绑定，不需要路由，对个队列绑到同一个交换器
        return BindingBuilder.bind(orderQueue2()).to(fanoutExchange());
    }

    @Bean
    public Binding orderBinging2() {
        return BindingBuilder.bind(orderQueue2()).to(fanoutExchange());
    }

}
