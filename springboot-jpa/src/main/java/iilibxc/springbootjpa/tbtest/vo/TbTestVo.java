package iilibxc.springbootjpa.tbtest.vo;

import iilibxc.springbootjpa. common.pojo.PageCondition;import lombok.Data;
import java.io.Serializable;
import java.util.Date;

@Data
public class TbTestVo extends PageCondition implements Serializable {
    private Integer id;//

    private String name;//

    private Date createTime;//

    private String falg;//

    private String text;//

}
