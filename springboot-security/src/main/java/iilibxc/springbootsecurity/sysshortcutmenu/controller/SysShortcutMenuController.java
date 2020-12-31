package iilibxc.springbootsecurity.sysshortcutmenu.controller;

import cn.huanzi.qch.springbootsecurity.common.controller.*;
import iilibxc.springbootsecurity.sysshortcutmenu.pojo.SysShortcutMenu;
import iilibxc.springbootsecurity.sysshortcutmenu.vo.SysShortcutMenuVo;
import iilibxc.springbootsecurity.sysshortcutmenu.service.SysShortcutMenuService;
import iilibxc.springbootsecurity.common.controller.CommonController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/sysShortcutMenu/")
public class SysShortcutMenuController extends CommonController<SysShortcutMenuVo, SysShortcutMenu, String> {
    @Autowired
    private SysShortcutMenuService sysShortcutMenuService;
}
