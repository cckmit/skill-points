package iilibxc.springbootmybatisplus.tbdescription.entity;

import iilibxc.springbootmybatisplus.common.entity.PageCondition;

import lombok.Data;

/**
 */
@Data
public class TbDescriptionVo extends PageCondition {
    private Integer id;
    private Integer userId;
    private String description;
}
