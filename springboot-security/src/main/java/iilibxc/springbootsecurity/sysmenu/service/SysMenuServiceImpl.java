package iilibxc.springbootsecurity.sysmenu.service;

import cn.huanzi.qch.springbootsecurity.common.service.*;
import iilibxc.springbootsecurity.common.service.CommonServiceImpl;
import iilibxc.springbootsecurity.sysmenu.pojo.SysMenu;
import iilibxc.springbootsecurity.sysmenu.vo.SysMenuVo;
import iilibxc.springbootsecurity.sysmenu.repository.SysMenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Service
@Transactional
public class SysMenuServiceImpl extends CommonServiceImpl<SysMenuVo, SysMenu, String> implements SysMenuService{

    @PersistenceContext
    private EntityManager em;
    @Autowired
    private SysMenuRepository sysMenuRepository;
}
