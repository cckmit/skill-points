package iilibxc.springbootmybatisplus.tbuser.controller;

import iilibxc.springbootmybatisplus.common.controller.CommonController;
import iilibxc.springbootmybatisplus.tbuser.entity.TbUser;
import iilibxc.springbootmybatisplus.tbuser.entity.TbUserVo;
import iilibxc.springbootmybatisplus.tbuser.service.TbUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 */
@RestController
@RequestMapping("/tbUser/")
public class TbUserController extends CommonController<TbUserVo, TbUser> {

    @Autowired
    private TbUserService tbUserService;

}