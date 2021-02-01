package iilibxc.springbootmybatisplus.tbdescription.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 */
@Data
public class TbDescription {

        //主键生成策略自动递增：type = IdType.AUTO，指定id回显
    @TableId(value = "id", type = IdType.AUTO)
        private Integer id;

    private Integer userId;

    private String description;
}
