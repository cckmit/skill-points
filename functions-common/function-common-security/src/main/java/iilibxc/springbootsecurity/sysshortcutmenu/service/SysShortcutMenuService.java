package iilibxc.springbootsecurity.sysshortcutmenu.service;

import iilibxc.springbootsecurity.common.pojo.Result;
import iilibxc.springbootsecurity.common.service.CommonService;
import iilibxc.springbootsecurity.sysshortcutmenu.pojo.SysShortcutMenu;
import iilibxc.springbootsecurity.sysshortcutmenu.vo.SysShortcutMenuVo;

import java.util.List;

public interface SysShortcutMenuService extends CommonService<SysShortcutMenuVo, SysShortcutMenu, String> {
    Result<List<SysShortcutMenuVo>> findByUserId(String userId);
}
