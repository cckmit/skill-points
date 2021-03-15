package iilibxc.springbootdatasource.service;

import iilibxc.springbootdatasource.bean.*;
import iilibxc.springbootdatasource.dao.test01.*;
import iilibxc.springbootdatasource.dao.test02.OrderDao;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {

    @Autowired
    OrderDao orderDao;

    @Autowired
    UserDao userDao;

    public List<Order> selectOrder() {
        return orderDao.selectOrderList();
    }

    public int saveOrder(){
        return orderDao.save(1,"aaaaa");
    }
    public int saveUser(){
        return userDao.save(2,"bbbbb");
    }

}
