package iilibxc.springrepeatsubmit.mapper;

import iilibxc.springrepeatsubmit.pojo.MsgLog;
import iilibxc.springrepeatsubmit.service.batch.BatchProcessMapper;

import java.util.List;

public interface MsgLogMapper extends BatchProcessMapper<MsgLog> {

    void insert(MsgLog msgLog);

    void updateStatus(MsgLog msgLog);

    List<MsgLog> selectTimeoutMsg();

    void updateTryCount(MsgLog msgLog);

    MsgLog selectByPrimaryKey(String msgId);

}
