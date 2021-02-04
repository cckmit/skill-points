package iilibxc.rmq.rabbitrmq.config;

import com.rabbitmq.client.Channel;
import iilibxc.rmq.rabbitrmq.queue.DirectQueue;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.AcknowledgeMode;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.listener.SimpleMessageListenerContainer;
import org.springframework.amqp.rabbit.listener.api.ChannelAwareMessageListener;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Slf4j
public class RabbitSimpleConfig {
    @Value("${spring.rabbitmq.listener.simple.concurrency}")
    private int concurrency;
    @Value("${spring.rabbitmq.listener.simple.max-concurrency}")
    private int max_concurrency;
    @Value("${spring.rabbitmq.listener.simple.prefetch}")
    private int prefetch;

    @Bean(name = "simpleMessageListenerContainer")
    public SimpleMessageListenerContainer simpleMessageListenerContainer(Queue orderQueue, ConnectionFactory connectionFactory) {
        SimpleMessageListenerContainer container = new SimpleMessageListenerContainer(connectionFactory);
        container.setQueues(orderQueue);//这里的参数可以支持多个队列，比如orderQueue(),productQueue()
        container.setExposeListenerChannel(true);
        container.setConcurrentConsumers(concurrency);//消费者初始并发值
        container.setMaxConcurrentConsumers(max_concurrency);//消费者最大并发值
        container.setPrefetchCount(prefetch);//某消费者一次监听可拉取的消息数
        container.setAcknowledgeMode(AcknowledgeMode.AUTO);//自动确认消息
        return container;
    }
}
