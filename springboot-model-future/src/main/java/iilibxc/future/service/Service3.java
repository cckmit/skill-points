package iilibxc.future.service;

import iilibxc.future.entity.User;
import iilibxc.future.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class Service3 {
    @Resource
    UserMapper userMapper;
    public User selectCreateTime(Integer i) throws InterruptedException {
        Thread.sleep(1000);
        User user = new User(i,null,null,null);
        return userMapper.selectCreateTime(user);
    }
}
