package iilibxc.springbootmybatis.service;


import iilibxc.springbootmybatis.pojo.Result;
import iilibxc.springbootmybatis.pojo.User;

public interface UserService {

    /**
     * 增
     */
    Result insert(User user);

    /**
     * 删
     */
    Result delete(User user);

    /**
     * 改
     */
    Result update(User user);

    /**
     * 查
     */
    Result select(User user);
}
