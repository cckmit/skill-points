package iilibxc.rmq.mq;

import iilibxc.rmq.entity.Info;
import iilibxc.rmq.mq.RabbitMqConfig;
import iilibxc.rmq.service.InfoService;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class RmqHandlerListener {

    @Resource
    private AmqpTemplate amqpTemplate;
    @Resource
    private InfoService infoService;

    @RabbitListener(queues = RabbitMqConfig.TOPIC_ROUTING_KEY_sendqueue)
    @RabbitHandler
    public void onMessageTopic(Message message) {

        Info info = infoService.getInfo(Integer.valueOf(String.valueOf(message.getBody())));
        amqpTemplate.convertAndSend(RabbitMqConfig.TOPIC_ECXCHANGE, RabbitMqConfig.TOPIC_ROUTING_KEY_sendqueue, info);
    }
    /*@RabbitListener(queues = "topic.test")
    @RabbitHandler
    public void onMessageDirect(Message message) {

        Info info = infoService.getInfo(1);
        amqpTemplate.convertAndSend("topicExchange", "routingKey.send", info);
    }*/
}
