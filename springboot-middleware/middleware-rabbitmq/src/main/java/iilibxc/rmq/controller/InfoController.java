package iilibxc.rmq.controller;

import iilibxc.rmq.entity.Info;
import iilibxc.rmq.mq.RabbitMqConfig;
import iilibxc.rmq.service.InfoService;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;


@RestController
@RequestMapping("/user")
public class InfoController {

    @Resource
    private AmqpTemplate amqpTemplate;
    @Resource
    private InfoService infoService;

    @GetMapping("getInfo/{id}")
    @ResponseBody
    public Info GetUser(@PathVariable Integer id) {
        id = 2021;
        amqpTemplate.convertAndSend(RabbitMqConfig.TOPIC_ECXCHANGE, RabbitMqConfig.TOPIC_ROUTING_KEY_sendqueue, id);
        return null;
    }
}
