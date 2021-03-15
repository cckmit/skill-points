package iilibxc.springbootsecurity.sysusermenu.service;

import iilibxc.springbootsecurity.common.pojo.Result;
import iilibxc.springbootsecurity.common.service.CommonService;
import iilibxc.springbootsecurity.sysusermenu.pojo.SysUserMenu;
import iilibxc.springbootsecurity.sysusermenu.vo.SysUserMenuVo;

import java.util.List;

public interface SysUserMenuService extends CommonService<SysUserMenuVo, SysUserMenu, String> {
    Result<List<SysUserMenuVo>> findByUserId(String userId);
}
