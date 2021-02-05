package iilibxc.rmq.rabbitrmq.queue;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RmqDirectQueue {
    @Value("${order.i_direct_queue}")
    private String I_DIRECT_QUEUE;
    @Value("${order.i_direct_exchange}")
    private String I_DIRECT_EXCHANGE;
    @Value("${order.i_direct_routing}")
    private String I_DIRECT_ROUTING;

    @Bean(name = "directExchange")
    public DirectExchange directExchange() {
        //创建持久化、非自动删除的交换器
        return new DirectExchange(I_DIRECT_EXCHANGE, true, false);
    }

    @Bean(name = "directQueue")
    public Queue directQueue() {
        //创建持久化的队列
        return new Queue(I_DIRECT_QUEUE, true);
    }

    @Bean(name = "directBinging")
    public Binding directBinging() {
        //通过路由将队列和交换器进行绑定
        return BindingBuilder.bind(directQueue()).to(directExchange()).with(I_DIRECT_ROUTING);
    }
}
