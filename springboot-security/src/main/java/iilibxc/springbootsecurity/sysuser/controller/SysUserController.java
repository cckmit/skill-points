package iilibxc.springbootsecurity.sysuser.controller;

import cn.huanzi.qch.springbootsecurity.common.controller.*;
import iilibxc.springbootsecurity.common.controller.CommonController;
import iilibxc.springbootsecurity.sysuser.pojo.SysUser;
import iilibxc.springbootsecurity.sysuser.vo.SysUserVo;
import iilibxc.springbootsecurity.sysuser.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/sysUser/")
public class SysUserController extends CommonController<SysUserVo, SysUser, String> {
    @Autowired
    private SysUserService sysUserService;
}
