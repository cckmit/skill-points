package iilibxc.springbootjpa.tbtest.pojo;

import lombok.Data;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "tb_test")
@Data
public class TbTest implements Serializable {
    @Id
    private Integer id;//

    private String name;//

    private Date createTime;//

    private String falg;//

    private String text;//

}
