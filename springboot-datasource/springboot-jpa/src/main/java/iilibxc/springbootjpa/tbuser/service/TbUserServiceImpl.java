package iilibxc.springbootjpa.tbuser.service;

import iilibxc.springbootjpa.common.service.CommonServiceImpl;
import iilibxc.springbootjpa.tbuser.pojo.TbUser;
import iilibxc.springbootjpa.tbuser.vo.TbUserVo;
import iilibxc.springbootjpa.tbuser.repository.TbUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Service
@Transactional
public class TbUserServiceImpl extends CommonServiceImpl<TbUserVo, TbUser, Integer> implements TbUserService{

    @PersistenceContext
    private EntityManager em;
    @Autowired
    private TbUserRepository tbUserRepository;
}
