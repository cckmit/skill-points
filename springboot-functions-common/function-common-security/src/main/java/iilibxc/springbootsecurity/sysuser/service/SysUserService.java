package iilibxc.springbootsecurity.sysuser.service;

import iilibxc.springbootsecurity.common.pojo.Result;
import iilibxc.springbootsecurity.common.service.CommonService;
import iilibxc.springbootsecurity.sysuser.pojo.SysUser;
import iilibxc.springbootsecurity.sysuser.vo.SysUserVo;

public interface SysUserService extends CommonService<SysUserVo, SysUser, String> {
    Result<SysUserVo> findByLoginName(String username);
}
