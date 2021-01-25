package iilibxc.springrepeatsubmit.service.impl;

import iilibxc.springrepeatsubmit.service.LoginLogService;
import iilibxc.springrepeatsubmit.mapper.LoginLogMapper;
import iilibxc.springrepeatsubmit.pojo.LoginLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginLogServiceImpl implements LoginLogService {

    @Autowired
    private LoginLogMapper loginLogMapper;

    @Override
    public void insert(LoginLog loginLog) {
        loginLogMapper.insert(loginLog);
    }

    @Override
    public LoginLog selectByMsgId(String msgId) {
        return loginLogMapper.selectByMsgId(msgId);
    }

}
