package iilibxc.future.service;

import iilibxc.future.entity.User;
import iilibxc.future.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.function.Supplier;

@Service
public class Service1 implements AllService , Supplier<User> {
    @Resource
    UserMapper userMapper;

    public User selectID(Integer i) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        User user = new User(i, null, null, null);
        return userMapper.selectID(user);
    }

    @Override
    public User selectID() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        User user = new User(46, null, null, null);
        return userMapper.selectID(user);
    }

    @Override
    public User get() {
        User user = new User(46, null, null, null);
        return userMapper.selectID(user);
    }
}
