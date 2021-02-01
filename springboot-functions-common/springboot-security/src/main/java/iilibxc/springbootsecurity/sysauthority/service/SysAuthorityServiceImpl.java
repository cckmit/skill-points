package iilibxc.springbootsecurity.sysauthority.service;

import iilibxc.springbootsecurity.sysauthority.pojo.SysAuthority;
import iilibxc.springbootsecurity.sysauthority.vo.SysAuthorityVo;
import iilibxc.springbootsecurity.sysauthority.repository.SysAuthorityRepository;
import iilibxc.springbootsecurity.common.service.CommonServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Service
@Transactional
public class SysAuthorityServiceImpl extends CommonServiceImpl<SysAuthorityVo, SysAuthority, String> implements SysAuthorityService{

    @PersistenceContext
    private EntityManager em;
    @Autowired
    private SysAuthorityRepository sysAuthorityRepository;
}
