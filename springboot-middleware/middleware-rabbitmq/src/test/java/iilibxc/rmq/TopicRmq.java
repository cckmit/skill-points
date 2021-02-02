package iilibxc.rmq;

import iilibxc.rmq.mq.RabbitMqConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.concurrent.CountDownLatch;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TopicRmq {
    @Resource
    private AmqpTemplate amqpTemplate;

    public static final int THREAD_NUM = 1000;
    @Test
    public void contextLoads() {
    }

    @Test
    public void councurent() {
        CountDownLatch countDownLatch = new CountDownLatch(THREAD_NUM);
        for (int i = 0; i < THREAD_NUM; i++) {
            new Thread(
                    () -> {
                        countDownLatch.countDown();
                        try {
                            countDownLatch.await();
                            System.out.println("---start---");
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        Integer message = 2021;//前端的传参
                        amqpTemplate.convertAndSend(RabbitMqConfig.TOPIC_ECXCHANGE, RabbitMqConfig.TOPIC_ROUTING_KEY_sendqueue, message);
                    }
            ).start();
        }
    }
}
