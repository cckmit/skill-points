package iilibxc.aop.service.impl;

import iilibxc.aop.annotation.SystemServiceLog;
import iilibxc.aop.service.UserService;
import org.springframework.stereotype.Service;

import java.util.Locale;

@Service
public class UserServiceImpl implements UserService {

    @Override
    @SystemServiceLog(description = "测试service层日志打印")
    public String test() {
        try {
            throw new Exception();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "测试service层日志打印";
    }
}
