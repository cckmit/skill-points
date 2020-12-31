package iilibxc.springbootsecurity.sysauthority.controller;

import cn.huanzi.qch.springbootsecurity.common.controller.*;
import iilibxc.springbootsecurity.sysauthority.pojo.SysAuthority;
import iilibxc.springbootsecurity.sysauthority.vo.SysAuthorityVo;
import iilibxc.springbootsecurity.sysauthority.service.SysAuthorityService;
import iilibxc.springbootsecurity.common.controller.CommonController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/sysAuthority/")
public class SysAuthorityController extends CommonController<SysAuthorityVo, SysAuthority, String> {
    @Autowired
    private SysAuthorityService sysAuthorityService;
}
