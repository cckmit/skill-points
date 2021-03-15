package iilibxc.springbootsecurity.sysusermenu.service;

import iilibxc.springbootsecurity.common.pojo.Result;
import iilibxc.springbootsecurity.common.service.CommonServiceImpl;
import iilibxc.springbootsecurity.sysusermenu.pojo.SysUserMenu;
import iilibxc.springbootsecurity.sysusermenu.repository.SysUserMenuRepository;
import iilibxc.springbootsecurity.sysusermenu.vo.SysUserMenuVo;
import iilibxc.springbootsecurity.util.CopyUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Service
@Transactional
public class SysUserMenuServiceImpl extends CommonServiceImpl<SysUserMenuVo, SysUserMenu, String> implements SysUserMenuService{

    @PersistenceContext
    private EntityManager em;
    @Autowired
    private SysUserMenuRepository sysUserMenuRepository;

    @Override
    public Result<List<SysUserMenuVo>> findByUserId(String userId) {
        return Result.of(CopyUtil.copyList(sysUserMenuRepository.findByUserId(userId), SysUserMenuVo.class));
    }
}
