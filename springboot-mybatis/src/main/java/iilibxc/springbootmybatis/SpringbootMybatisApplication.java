package iilibxc.springbootmybatis;

import iilibxc.springbootmybatis.service.UserService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@MapperScan("iilibxc.springbootmybatis.mapper")
@RestController
public class SpringbootMybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootMybatisApplication.class, args);
    }

    @Autowired
    UserService userService;
    @GetMapping("users")
    public Object users(){
       return userService.page();
    }

}
