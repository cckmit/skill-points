package iilibxc.springbootmybatis.bean;

import lombok.Data;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Data
@Table(name = "tb_user")
public class User {

    @Id
    @KeySql(useGeneratedKeys = true)
    private Integer id;

    private String username;

    private String password;

    private Date created;
}
