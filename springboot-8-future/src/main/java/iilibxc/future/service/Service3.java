package iilibxc.future.service;

import iilibxc.future.entity.User;
import iilibxc.future.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.function.Supplier;

@Service
public class Service3 implements AllService, Supplier<User> {
    @Resource
    UserMapper userMapper;

    public User selectCreateTime(Integer i) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        User user = new User(i, null, null, null);
        return userMapper.selectCreateTime(user);
    }

    public User selectID(Integer i) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        User user = new User(i, null, null, null);
        return userMapper.selectCreateTime(user);
    }

    @Override
    public User selectID() {
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        String s = request.getParameter("ID");
        Integer i = Integer.valueOf(s);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        User user = new User(i, null, null, null);
        return userMapper.selectCreateTime(user);
    }

    @Override
    public User get() {
        User user = new User(46, null, null, null);
        return userMapper.selectID(user);
    }
}
