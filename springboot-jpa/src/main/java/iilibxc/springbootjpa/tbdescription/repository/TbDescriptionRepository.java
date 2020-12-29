package iilibxc.springbootjpa.tbdescription.repository;

import iilibxc.springbootjpa.tbdescription.pojo.TbDescription;
import iilibxc.springbootjpa.common.repository.CommonRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TbDescriptionRepository extends CommonRepository<TbDescription, Integer> {
}
