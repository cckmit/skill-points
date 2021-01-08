package iilibxc.springbootsecurity.sysusermenu.controller;

import iilibxc.springbootsecurity.common.controller.CommonController;
import iilibxc.springbootsecurity.sysusermenu.pojo.SysUserMenu;
import iilibxc.springbootsecurity.sysusermenu.vo.SysUserMenuVo;
import iilibxc.springbootsecurity.sysusermenu.service.SysUserMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/sysUserMenu/")
public class SysUserMenuController extends CommonController<SysUserMenuVo, SysUserMenu, String> {
    @Autowired
    private SysUserMenuService sysUserMenuService;
}
