package iilibxc.springbootmybatisplus.tbuser.entity;

import iilibxc.springbootmybatisplus.common.entity.PageCondition;

import java.util.Date;

import lombok.Data;

/**
 */
@Data
public class TbUserVo extends PageCondition {
    private Integer id;
    private String username;
    private String password;
    private Date created;
    private Integer descriptionId;
}
