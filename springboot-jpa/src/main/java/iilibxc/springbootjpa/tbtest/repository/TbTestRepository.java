package iilibxc.springbootjpa.tbtest.repository;

import iilibxc.springbootjpa.common.repository.*;
import iilibxc.springbootjpa.tbtest.pojo.TbTest;
import org.springframework.stereotype.Repository;

@Repository
public interface TbTestRepository extends CommonRepository<TbTest, Integer> {
}
