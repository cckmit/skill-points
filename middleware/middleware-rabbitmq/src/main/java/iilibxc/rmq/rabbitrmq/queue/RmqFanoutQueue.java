package iilibxc.rmq.rabbitrmq.queue;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.FanoutExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RmqFanoutQueue {
    @Value("${order.i_fanout_queue}")
    private String I_FANOUT_QUEUE;
    @Value("${order.i_fanout_exchange}")
    private String I_FANOUT_EXCHANGE;

    @Bean(name="fanoutExchange")
    public FanoutExchange fanoutExchange() {
        return new FanoutExchange(I_FANOUT_EXCHANGE, true, false);
    }

    @Bean(name = "fanoutQueue")
    public Queue fanoutQueue() {
        //第二个队列名称自行定义，这里只是做一个示范
        return new Queue(I_FANOUT_QUEUE, true);
    }

    @Bean(name="fanoutBinging")
    public Binding fanoutBinging() {
        //将队列和交换器进行绑定，不需要路由，对个队列绑到同一个交换器
        return BindingBuilder.bind(fanoutQueue()).to(fanoutExchange());
    }
}
