package top.clyde.splitos;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(value = "top.clyde.splitos.mapper")
@SpringBootApplication
public class SplitosApplication {

    public static void main(String[] args) {
        SpringApplication.run(SplitosApplication.class, args);
    }
}
