package iilibxc.future;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("iilibxc.iilibxc.future.mapper")
public class FutureApplication {
    public static void main(String[] args) {
        SpringApplication.run(FutureApplication.class,args);
    }
}
