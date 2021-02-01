package iilibxc.future.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.function.Supplier;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class User  {

    private Integer id;

    private String username;

    private String password;

    private Date created;


}
