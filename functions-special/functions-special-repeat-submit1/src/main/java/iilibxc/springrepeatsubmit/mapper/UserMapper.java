package iilibxc.springrepeatsubmit.mapper;

import iilibxc.springrepeatsubmit.pojo.User;
import iilibxc.springrepeatsubmit.service.batch.BatchProcessMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper extends BatchProcessMapper<User> {

    List<User> selectAll();

    User selectOne(Integer id);

    void insert(User user);

    void update(User user);

    void delete(Integer id);

    User selectByUsernameAndPassword(@Param("username") String username, @Param("password") String password);

    User selectByUsername(@Param("username") String username);

}
