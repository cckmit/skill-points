package iilibxc.springbootasync.repository;

import iilibxc.springbootasync.pojo.TbUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface TbUserRepository extends JpaRepository<TbUser, Integer>, JpaSpecificationExecutor<TbUser> {
}
