package iilibxc.springbootjpa.tbtest.service;

import iilibxc.springbootjpa.common.service.*;
import iilibxc.springbootjpa.tbtest.pojo.TbTest;
import iilibxc.springbootjpa.tbtest.vo.TbTestVo;
import iilibxc.springbootjpa.tbtest.repository.TbTestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Service
@Transactional
public class TbTestServiceImpl extends CommonServiceImpl<TbTestVo, TbTest, Integer> implements TbTestService{

    @PersistenceContext
    private EntityManager em;
    @Autowired
    private TbTestRepository tbTestRepository;
}
