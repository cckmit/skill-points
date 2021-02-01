package iilibxc.springbootjpa.tbuser.controller;

import iilibxc.springbootjpa.tbuser.pojo.TbUser;
import iilibxc.springbootjpa.tbuser.vo.TbUserVo;
import iilibxc.springbootjpa.tbuser.service.TbUserService;
import iilibxc.springbootjpa.common.controller.CommonController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/tbUser/")
public class TbUserController extends CommonController<TbUserVo, TbUser, Integer> {
    @Autowired
    private TbUserService tbUserService;
}
