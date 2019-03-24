package top.point9.blogv1single;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("top.point9.blogv1single.mapper")
public class BlogV1SingleApplication {

    public static void main(String[] args) {
        SpringApplication.run(BlogV1SingleApplication.class, args);
    }

}
