package batch.producer;

import batch.BatchApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.kafka.support.SendResult;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.concurrent.ListenableFutureCallback;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ConcurrentMap;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = BatchApplication.class)
public class Demo02ProducerTest {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private Demo02Producer producer;

    @Test
    public void testASyncSend() throws InterruptedException {
        logger.info("[testASyncSend][开始执行]");
        List<String> list = new ArrayList();
        list.add("X");
        Collection<String> c = Collections.unmodifiableCollection(list);
        c.add("Y");
        for (int i = 0; i < 3; i++) {
            int id = (int) (System.currentTimeMillis() / 1000);
            producer.asyncSend(id).addCallback(new ListenableFutureCallback<SendResult<Object, Object>>() {

                @Override
                public void onFailure(Throwable e) {
                    logger.info("[testASyncSend][发送编号：[{}] 发送异常]]", id, e);
                }

                @Override
                public void onSuccess(SendResult<Object, Object> result) {
                    logger.info("[testASyncSend][发送编号：[{}] 发送成功，结果为：[{}]]", id, result);
                }

            });

            // 故意每条消息之间，隔离 10 秒
            Thread.sleep(10 * 1000L);
        }

        // 阻塞等待，保证消费
        new CountDownLatch(1).await();
    }

}
