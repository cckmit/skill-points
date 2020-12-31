package iilibxc.springbootmybatisplus.tbdescription.service;

import iilibxc.springbootmybatisplus.common.service.CommonServiceImpl;
import iilibxc.springbootmybatisplus.tbdescription.entity.TbDescription;
import iilibxc.springbootmybatisplus.tbdescription.entity.TbDescriptionVo;
import iilibxc.springbootmybatisplus.tbdescription.mapper.TbDescriptionMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 */
@Service
public class TbDescriptionServiceImpl  extends CommonServiceImpl<TbDescriptionVo,TbDescription>  implements TbDescriptionService {

    @Autowired
    private TbDescriptionMapper tbdescriptionMapper;
}
