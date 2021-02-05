package iilibxc.rmq.rabbitrmq.handler;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

//第二个消费者
@Component
@RabbitListener(queues = "${order.i_fanout_queue}")
@Slf4j
public class FanoutListener {
    @RabbitHandler
    public void orderQueue(String msg) {
        log.info("Fanout接收到的消息" + ((int) (Math.random() * 1000)) + ":" + msg);
    }

}