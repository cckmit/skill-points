package iilibxc.springbootjpa.tbdescription.service;

import iilibxc.springbootjpa.tbdescription.pojo.TbDescription;
import iilibxc.springbootjpa.tbdescription.vo.TbDescriptionVo;
import iilibxc.springbootjpa.tbdescription.repository.TbDescriptionRepository;
import iilibxc.springbootjpa.common.service.CommonServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Service
@Transactional
public class TbDescriptionServiceImpl extends CommonServiceImpl<TbDescriptionVo, TbDescription, Integer> implements TbDescriptionService{

    @PersistenceContext
    private EntityManager em;
    @Autowired
    private TbDescriptionRepository tbDescriptionRepository;
}
