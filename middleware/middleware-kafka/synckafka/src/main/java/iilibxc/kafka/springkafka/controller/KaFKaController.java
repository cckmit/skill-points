package iilibxc.kafka.springkafka.controller;

import iilibxc.kafka.springkafka.entity.User;
import iilibxc.kafka.springkafka.kafkaproducer.MyKafkaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


public class KaFKaController {
    /**
     * 测试控制器
     * PS:@RestController 注解： 该注解是 @Controller 和 @ResponseBody 注解的合体版
     */


    private User user;

    @Autowired
    private MyKafkaProducer kafkaProducer;

    @RequestMapping("/createMsg")
    public void createMsg() {
        kafkaProducer.sendUserMessage(user);
    }
}
