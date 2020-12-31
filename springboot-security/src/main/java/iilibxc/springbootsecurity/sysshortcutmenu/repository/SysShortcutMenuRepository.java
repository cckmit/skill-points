package iilibxc.springbootsecurity.sysshortcutmenu.repository;

import iilibxc.springbootsecurity.common.repository.CommonRepository;
import iilibxc.springbootsecurity.sysshortcutmenu.pojo.SysShortcutMenu;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SysShortcutMenuRepository extends CommonRepository<SysShortcutMenu, String> {
    List<SysShortcutMenu> findByUserId(String userId);
}
