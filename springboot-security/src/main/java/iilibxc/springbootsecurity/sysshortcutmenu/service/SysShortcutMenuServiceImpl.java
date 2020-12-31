package iilibxc.springbootsecurity.sysshortcutmenu.service;

import iilibxc.springbootsecurity.common.pojo.Result;
import iilibxc.springbootsecurity.common.service.CommonServiceImpl;
import iilibxc.springbootsecurity.sysshortcutmenu.pojo.SysShortcutMenu;
import iilibxc.springbootsecurity.sysshortcutmenu.repository.SysShortcutMenuRepository;
import iilibxc.springbootsecurity.sysshortcutmenu.vo.SysShortcutMenuVo;
import iilibxc.springbootsecurity.util.CopyUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Service
@Transactional
public class SysShortcutMenuServiceImpl extends CommonServiceImpl<SysShortcutMenuVo, SysShortcutMenu, String> implements SysShortcutMenuService{

    @PersistenceContext
    private EntityManager em;
    @Autowired
    private SysShortcutMenuRepository sysShortcutMenuRepository;

    @Override
    public Result<List<SysShortcutMenuVo>> findByUserId(String userId) {
        return Result.of(CopyUtil.copyList(sysShortcutMenuRepository.findByUserId(userId), SysShortcutMenuVo.class));
    }
}
