package iilibxc.springbootredis.service.impl;

import iilibxc.springbootredis.model.User;
import iilibxc.springbootredis.service.UserService;
import org.slf4j.LoggerFactory;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {
    
    private static final org.slf4j.Logger log = LoggerFactory.getLogger(UserServiceImpl.class);
    
    private User user = new User(1l, "abc1", "13512345678", "123456", "role-user");
    
    @Cacheable(value = "user", key= "#userId")
    @Override
    public User getUserById(long userId) {
        
        log.info("加载用户信息");
        return user;
    }
    
//    @CachePut(value= "user", key= "#userId")
    @CacheEvict(value = "user", key= "#userId")
    @Override
    public User updateUserNickname(long userId, String nickname) {
        
        user.setNickname(nickname);
        
        return user;
    }
}