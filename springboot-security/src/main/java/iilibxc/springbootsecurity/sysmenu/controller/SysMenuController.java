package iilibxc.springbootsecurity.sysmenu.controller;

import iilibxc.springbootsecurity.common.controller.CommonController;
import iilibxc.springbootsecurity.sysmenu.pojo.SysMenu;
import iilibxc.springbootsecurity.sysmenu.vo.SysMenuVo;
import iilibxc.springbootsecurity.sysmenu.service.SysMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/sysMenu/")
public class SysMenuController extends CommonController<SysMenuVo, SysMenu, String> {
    @Autowired
    private SysMenuService sysMenuService;
}
