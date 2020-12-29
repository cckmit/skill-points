package iilibxc.springbootmybatis.service;

import iilibxc.springbootmybatis.mapper.UserMapper;
import iilibxc.springbootmybatis.pojo.Result;
import iilibxc.springbootmybatis.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public Result insert(User user) {
        int i = userMapper.insert(user);
        if (i > 0) {
            return Result.build(200, "操作成功！", user);
        } else {
            return Result.build(400, "操作失败！", null);
        }
    }

    @Override
    public Result delete(User user) {
        int i = userMapper.delete(user);
        if (i > 0) {
            return Result.build(200, "操作成功！", user);
        } else {
            return Result.build(400, "操作失败！", null);
        }
    }

    @Override
    public Result update(User user) {
        int i = userMapper.update(user);
        if (i > 0) {
            return select(user);
        } else {
            return Result.build(400, "操作失败！", null);
        }
    }

    @Override
    public Result select(User user) {
        User user1 = userMapper.select(user);
        if (user1 != null) {
            return Result.build(200, "操作成功！", user1);
        } else {
            return Result.build(400, "操作失败！", user1);
        }
    }
}
