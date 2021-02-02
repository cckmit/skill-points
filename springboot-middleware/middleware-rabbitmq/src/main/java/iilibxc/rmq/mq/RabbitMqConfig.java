package iilibxc.rmq.mq;

import org.springframework.amqp.core.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/*FIFO队列，先进先出*/
@Configuration
public class RabbitMqConfig {

    public static final String DIRECT_ROUTING_KEY_sendqueue = "iilibxc.directQueue";
    public static final String TOPIC_ROUTING_KEY_sendqueue = "iilibxc.topicQueue";
    public static final String DIRECT_ECXCHANGE = "iilibxc.directExchange";
    public static final String TOPIC_ECXCHANGE = "iilibxc.topicExchange";


    @Bean
    public Queue directSendQueue() {
        Queue queue = new Queue(DIRECT_ROUTING_KEY_sendqueue, true);
        return queue;
    }

    @Bean
    public DirectExchange directExchange() {
        DirectExchange directExchange = new DirectExchange(DIRECT_ECXCHANGE);
        return directExchange;
    }

    @Bean
    public Binding directBind() {
        return BindingBuilder.bind(directSendQueue()).to(directExchange()).with(DIRECT_ECXCHANGE);
    }

    /*----------------------------------------------------------------------------------------*/

    @Bean
    public Queue topSendQueue() {
        Queue queue = new Queue(TOPIC_ROUTING_KEY_sendqueue, true);
        return queue;
    }

    @Bean
    public TopicExchange topicExchange() {
        TopicExchange topicExchange = new TopicExchange(TOPIC_ECXCHANGE);
        return topicExchange;
    }

    @Bean
    public Binding topicBind() {
        return BindingBuilder.bind(topSendQueue()).to(topicExchange()).with(TOPIC_ROUTING_KEY_sendqueue);
    }
    /*
        direct：如果路由键匹配，则直接投递到对应的队列

        fanout：不处理路由键，向所有与之绑定的队列投递消息

        topic：处理路由键，按模式匹配，向符合规则的队列投递消息

        headers：允许匹配消息的header，而非路由键，除此之外，direct完全一致，但性能差很多，基本不用了。

    * */
}
