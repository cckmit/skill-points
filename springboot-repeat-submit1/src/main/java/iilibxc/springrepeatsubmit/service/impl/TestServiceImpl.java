package iilibxc.springrepeatsubmit.service.impl;

import iilibxc.springrepeatsubmit.service.TestService;
import iilibxc.springrepeatsubmit.mq.MessageHelper;
import iilibxc.springrepeatsubmit.common.ResponseCode;
import iilibxc.springrepeatsubmit.common.ServerResponse;
import iilibxc.springrepeatsubmit.config.RabbitConfig;
import iilibxc.springrepeatsubmit.mapper.MsgLogMapper;
import iilibxc.springrepeatsubmit.pojo.Mail;
import iilibxc.springrepeatsubmit.pojo.MsgLog;
import iilibxc.springrepeatsubmit.util.RandomUtil;
import org.springframework.amqp.rabbit.connection.CorrelationData;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private MsgLogMapper msgLogMapper;

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Override
    public ServerResponse testIdempotence() {
        return ServerResponse.success("testIdempotence: success");
    }

    @Override
    public ServerResponse accessLimit() {
        return ServerResponse.success("accessLimit: success");
    }

    @Override
    public ServerResponse send(Mail mail) {
        String msgId = RandomUtil.UUID32();
        mail.setMsgId(msgId);

        MsgLog msgLog = new MsgLog(msgId, mail, RabbitConfig.MAIL_EXCHANGE_NAME, RabbitConfig.MAIL_ROUTING_KEY_NAME);
        msgLogMapper.insert(msgLog);// 消息入库

        CorrelationData correlationData = new CorrelationData(msgId);
        rabbitTemplate.convertAndSend(RabbitConfig.MAIL_EXCHANGE_NAME, RabbitConfig.MAIL_ROUTING_KEY_NAME, MessageHelper.objToMsg(mail), correlationData);// 发送消息

        return ServerResponse.success(ResponseCode.MAIL_SEND_SUCCESS.getMsg());
    }

}
