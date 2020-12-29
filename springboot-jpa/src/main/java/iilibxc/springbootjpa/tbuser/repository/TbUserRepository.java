package iilibxc.springbootjpa.tbuser.repository;

import iilibxc.springbootjpa.tbuser.pojo.TbUser;
import iilibxc.springbootjpa.common.repository.CommonRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TbUserRepository extends CommonRepository<TbUser, Integer> {
}
