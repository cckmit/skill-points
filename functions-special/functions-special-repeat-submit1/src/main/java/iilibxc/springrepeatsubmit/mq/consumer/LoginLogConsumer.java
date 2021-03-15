package iilibxc.springrepeatsubmit.mq.consumer;

import iilibxc.springrepeatsubmit.mq.BaseConsumer;
import iilibxc.springrepeatsubmit.mq.MessageHelper;
import com.rabbitmq.client.Channel;
import iilibxc.springrepeatsubmit.service.LoginLogService;
import iilibxc.springrepeatsubmit.pojo.LoginLog;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class LoginLogConsumer implements BaseConsumer {

    @Autowired
    private LoginLogService loginLogService;

    @Override
    public void consume(Message message, Channel channel) {
        log.info("收到消息: {}", message.toString());
        LoginLog loginLog = MessageHelper.msgToObj(message, LoginLog.class);
        loginLogService.insert(loginLog);
    }
}
