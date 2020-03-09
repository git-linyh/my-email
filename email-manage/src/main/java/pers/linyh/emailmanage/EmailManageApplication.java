package pers.linyh.emailmanage;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("pers.linyh.emailmanage.mapper")
public class EmailManageApplication {

    public static void main(String[] args) {
        SpringApplication.run(EmailManageApplication.class, args);
    }

}
