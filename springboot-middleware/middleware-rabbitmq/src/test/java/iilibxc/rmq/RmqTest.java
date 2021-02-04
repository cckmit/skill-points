package iilibxc.rmq;

import iilibxc.rmq.rabbitrmq.config.RabbitMqConfig;
import iilibxc.rmq.service.OrderService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.concurrent.CountDownLatch;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RmqTest {

    @Resource
    private AmqpTemplate amqpTemplate;
    @Resource
    private OrderService orderService;

    public static final int THREAD_NUM = 1000;

    @Test
    public void contextLoads() {
    }

    @Test
    public void direct() {
        CountDownLatch countDownLatch = new CountDownLatch(THREAD_NUM);
        for (int i = 0; i < THREAD_NUM; i++) {
            new Thread(
                    () -> {
                        countDownLatch.countDown();
                        try {
                            countDownLatch.await();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        orderService.createOrder();
                    }
            ).start();
        }
    }

    @Test
    public void topic() {
        CountDownLatch countDownLatch = new CountDownLatch(THREAD_NUM);
        for (int i = 0; i < THREAD_NUM; i++) {
            new Thread(
                    () -> {
                        countDownLatch.countDown();
                        try {
                            countDownLatch.await();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                    }
            ).start();
        }
    }
}
