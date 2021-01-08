package iilibxc.springbootsecurity.sysuserauthority.controller;

import iilibxc.springbootsecurity.sysuserauthority.pojo.SysUserAuthority;
import iilibxc.springbootsecurity.sysuserauthority.vo.SysUserAuthorityVo;
import iilibxc.springbootsecurity.sysuserauthority.service.SysUserAuthorityService;
import iilibxc.springbootsecurity.common.controller.CommonController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/sysUserAuthority/")
public class SysUserAuthorityController extends CommonController<SysUserAuthorityVo, SysUserAuthority, String> {
    @Autowired
    private SysUserAuthorityService sysUserAuthorityService;
}
