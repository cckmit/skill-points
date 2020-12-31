package iilibxc.springbootsecurity.sysuserauthority.repository;

import iilibxc.springbootsecurity.common.repository.CommonRepository;
import iilibxc.springbootsecurity.sysuserauthority.pojo.SysUserAuthority;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SysUserAuthorityRepository extends CommonRepository<SysUserAuthority, String> {
    List<SysUserAuthority> findByUserId(String userId);
}
