package iilibxc.springbootjpa.tbdescription.vo;

import iilibxc.springbootjpa.common.pojo.PageCondition;
import lombok.Data;
import java.io.Serializable;

@Data
public class TbDescriptionVo extends PageCondition implements Serializable {
    private Integer id;//

    private Integer userId;//

    private String description;//

}
