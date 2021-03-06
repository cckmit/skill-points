package iilibxc.springbootsecurity.sysmenu.repository;

import iilibxc.springbootsecurity.common.repository.CommonRepository;
import iilibxc.springbootsecurity.sysmenu.pojo.SysMenu;
import org.springframework.stereotype.Repository;

@Repository
public interface SysMenuRepository extends CommonRepository<SysMenu, String> {
}
