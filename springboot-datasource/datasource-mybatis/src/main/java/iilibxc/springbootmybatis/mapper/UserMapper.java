package iilibxc.springbootmybatis.mapper;

import iilibxc.springbootmybatis.bean.User;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface UserMapper extends Mapper<User> {
    /**
     * 增
     */
//    @Insert(value = "insert into tb_user(username,password,created) value(#{username},#{password},#{created})")
//    @Options(useGeneratedKeys = true)
    int insert(User user);

    /**
     * 删
     */
//    @Delete("delete from tb_user where id = #{id}")
    int delete(User user);

    /**
     * 改
     */
//    @Update(value = "update tb_user set username = #{username} where id = #{id}")
    int update(User user);

    /**
     * 查
     * @return
     */
//    @Select(value = "select * from tb_user where id = #{id}")
    List<User> select(User user);

}
