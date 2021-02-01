package iilibxc.springrepeatsubmit.service;

import iilibxc.springrepeatsubmit.pojo.LoginLog;

public interface LoginLogService {

    void insert(LoginLog loginLog);

    LoginLog selectByMsgId(String msgId);

}
