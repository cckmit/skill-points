package iilibxc.springbootsecurity.sysuser.service;

import iilibxc.springbootsecurity.common.pojo.Result;
import iilibxc.springbootsecurity.common.service.CommonServiceImpl;
import iilibxc.springbootsecurity.sysuser.pojo.SysUser;
import iilibxc.springbootsecurity.sysuser.repository.SysUserRepository;
import iilibxc.springbootsecurity.sysuser.vo.SysUserVo;
import iilibxc.springbootsecurity.util.CopyUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Service
@Transactional
public class SysUserServiceImpl extends CommonServiceImpl<SysUserVo, SysUser, String> implements SysUserService{

    @PersistenceContext
    private EntityManager em;
    @Autowired
    private SysUserRepository sysUserRepository;

    @Override
    public Result<SysUserVo> findByLoginName(String username) {
        return Result.of(CopyUtil.copy(sysUserRepository.findByLoginName(username),SysUserVo.class));
    }
}
