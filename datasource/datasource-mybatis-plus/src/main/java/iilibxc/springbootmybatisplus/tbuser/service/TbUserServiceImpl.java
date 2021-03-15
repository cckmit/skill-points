package iilibxc.springbootmybatisplus.tbuser.service;

import iilibxc.springbootmybatisplus.common.service.CommonServiceImpl;
import iilibxc.springbootmybatisplus.tbuser.entity.TbUser;
import iilibxc.springbootmybatisplus.tbuser.entity.TbUserVo;
import iilibxc.springbootmybatisplus.tbuser.mapper.TbUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 */
@Service
public class TbUserServiceImpl  extends CommonServiceImpl<TbUserVo, TbUser> implements TbUserService {

    @Autowired
    private TbUserMapper tbuserMapper;
}
