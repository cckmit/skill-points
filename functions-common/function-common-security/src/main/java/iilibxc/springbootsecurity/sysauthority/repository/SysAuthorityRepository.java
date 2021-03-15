package iilibxc.springbootsecurity.sysauthority.repository;

import iilibxc.springbootsecurity.sysauthority.pojo.SysAuthority;
import iilibxc.springbootsecurity.common.repository.CommonRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SysAuthorityRepository extends CommonRepository<SysAuthority, String> {
}
