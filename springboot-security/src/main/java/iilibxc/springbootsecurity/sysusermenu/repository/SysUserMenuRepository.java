package iilibxc.springbootsecurity.sysusermenu.repository;

import iilibxc.springbootsecurity.common.repository.CommonRepository;
import iilibxc.springbootsecurity.sysusermenu.pojo.SysUserMenu;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SysUserMenuRepository extends CommonRepository<SysUserMenu, String> {
    List<SysUserMenu> findByUserId(String userId);
}
