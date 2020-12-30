package iilibxc.springbootmybatisplus.tbuser.entity;

import iilibxc.springbootmybatisplus.common.entity.PageCondition;

import java.util.Date;

import lombok.Data;

/**
 * <p>
 * 用户信息表
 * </p>
 *
 * @author huanzi-qch
 * @since 2020-08-25
 */
@Data
public class TbUserVo extends PageCondition {
    private Integer id;
    private String username;
    private String password;
    private Date created;
    private Integer descriptionId;
}
