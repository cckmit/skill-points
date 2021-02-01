package iilibxc.springrepeatsubmit.mapper;

import iilibxc.springrepeatsubmit.pojo.LoginLog;

public interface LoginLogMapper {

    void insert(LoginLog loginLog);

    LoginLog selectByMsgId(String msgId);

}
