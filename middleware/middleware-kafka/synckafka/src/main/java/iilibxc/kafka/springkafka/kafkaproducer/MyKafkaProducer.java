package iilibxc.kafka.springkafka.kafkaproducer;

import com.google.gson.GsonBuilder;
import iilibxc.kafka.springkafka.entity.User;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * Kafka消息生产类
 */
/*@Log
@Component*/
public class MyKafkaProducer {

    @Resource
    private KafkaTemplate<String, String> kafkaTemplate;

    @Value("${kafka.topic.user}")
    private String topicUser;//topic名称

    /**
     * 发送用户消息
     *
     * @param user 用户信息
     */
    public void sendUserMessage(User user) {
        GsonBuilder builder = new GsonBuilder();
        builder.setPrettyPrinting();
        builder.setDateFormat("yyyy-MM-dd HH:mm:ss");
        String message = builder.create().toJson(user);
        kafkaTemplate.send(topicUser, message);
        //log.info("\n生产消息至Kafka\n" + message);
    }
}