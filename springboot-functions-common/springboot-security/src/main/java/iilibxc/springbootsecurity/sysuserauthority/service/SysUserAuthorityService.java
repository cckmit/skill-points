package iilibxc.springbootsecurity.sysuserauthority.service;

import iilibxc.springbootsecurity.common.pojo.Result;
import iilibxc.springbootsecurity.common.service.CommonService;
import iilibxc.springbootsecurity.sysuserauthority.pojo.SysUserAuthority;
import iilibxc.springbootsecurity.sysuserauthority.vo.SysUserAuthorityVo;

import java.util.List;

public interface SysUserAuthorityService extends CommonService<SysUserAuthorityVo, SysUserAuthority, String> {
    Result<List<SysUserAuthorityVo>> findByUserId(String userId);
}
