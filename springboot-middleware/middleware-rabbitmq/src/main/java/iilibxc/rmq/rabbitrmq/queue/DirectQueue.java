package iilibxc.rmq.rabbitrmq.queue;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DirectQueue {
    @Value("${order.queue_name}")
    private String ORDER_QUEUE_NAME;
    @Value("${order.exchange_name}")
    private String ORDER_EXCHANGE_NAME;
    @Value("${order.routing_key_name}")
    private String ORDER_ROUTING_KEY_NAME;

    @Bean
    public DirectExchange orderExchange(){
        //创建持久化、非自动删除的交换器
        return new DirectExchange(ORDER_EXCHANGE_NAME,true,false);
    }
    @Bean
    public Queue orderQueue(){
        //创建持久化的队列
        return new Queue(ORDER_QUEUE_NAME,true);
    }
    @Bean
    public Binding orderBinging(){
        //通过路由将队列和交换器进行绑定
        return BindingBuilder.bind(orderQueue()).to(orderExchange()).with(ORDER_ROUTING_KEY_NAME);
    }
}
