package iilibxc.springbootsecurity.sysuserauthority.service;

import iilibxc.springbootsecurity.common.pojo.Result;
import cn.huanzi.qch.springbootsecurity.common.service.*;
import iilibxc.springbootsecurity.sysuserauthority.pojo.SysUserAuthority;
import iilibxc.springbootsecurity.sysuserauthority.vo.SysUserAuthorityVo;
import iilibxc.springbootsecurity.sysuserauthority.repository.SysUserAuthorityRepository;
import iilibxc.springbootsecurity.util.CopyUtil;
import iilibxc.springbootsecurity.common.service.CommonServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Service
@Transactional
public class SysUserAuthorityServiceImpl extends CommonServiceImpl<SysUserAuthorityVo, SysUserAuthority, String> implements SysUserAuthorityService{

    @PersistenceContext
    private EntityManager em;
    @Autowired
    private SysUserAuthorityRepository sysUserAuthorityRepository;

    @Override
    public Result<List<SysUserAuthorityVo>> findByUserId(String userId) {
        return Result.of(CopyUtil.copyList(sysUserAuthorityRepository.findByUserId(userId),SysUserAuthorityVo.class));
    }
}
