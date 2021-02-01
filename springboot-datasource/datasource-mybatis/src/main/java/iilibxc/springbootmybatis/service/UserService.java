package iilibxc.springbootmybatis.service;


import iilibxc.springbootmybatis.bean.User;

public interface UserService {

    void insert(User user);

    void update(User user);

    void delete(Long id);

    void get(Long id);

    void list();

    Object page();

    void pageByExample();
}
