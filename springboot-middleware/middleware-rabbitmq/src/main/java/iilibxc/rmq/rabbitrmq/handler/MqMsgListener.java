package iilibxc.rmq.rabbitrmq.handler;

import iilibxc.rmq.entity.Info;
import iilibxc.rmq.rabbitrmq.config.RabbitMqConfig;
import iilibxc.rmq.service.InfoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
@Slf4j
@RabbitListener(queues = "${order.queue_name}")
public class MqMsgListener {
    @RabbitHandler
    public void orderQueue(String msg) {
        log.info("接收到的消息:" + msg);
    }
}
