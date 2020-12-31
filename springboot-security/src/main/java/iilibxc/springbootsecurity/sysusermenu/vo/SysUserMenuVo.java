package iilibxc.springbootsecurity.sysusermenu.vo;

import iilibxc.springbootsecurity.common.pojo.PageCondition;
import iilibxc.springbootsecurity.sysmenu.vo.SysMenuVo;
import iilibxc.springbootsecurity.sysuser.vo.SysUserVo;
import lombok.Data;

import java.io.Serializable;

@Data
public class SysUserMenuVo extends PageCondition implements Serializable {
    private String userMenuId;//用户菜单表id

    private String userId;//用户id

    private String menuId;//菜单id

    private SysUserVo sysUser;//用户

    private SysMenuVo sysMenu;//菜单
}
