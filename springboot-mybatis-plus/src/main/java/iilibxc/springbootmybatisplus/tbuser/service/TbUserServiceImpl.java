package iilibxc.springbootmybatisplus.tbuser.service;

import iilibxc.springbootmybatisplus.common.service.CommonServiceImpl;
import iilibxc.springbootmybatisplus.tbuser.entity.TbUser;
import iilibxc.springbootmybatisplus.tbuser.entity.TbUserVo;
import iilibxc.springbootmybatisplus.tbuser.mapper.TbUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户信息表 服务实现类
 * </p>
 *
 * @author huanzi-qch
 * @since 2020-08-25
 */
@Service
public class TbUserServiceImpl  extends CommonServiceImpl<TbUserVo, TbUser> implements TbUserService {

    @Autowired
    private TbUserMapper tbuserMapper;
}
