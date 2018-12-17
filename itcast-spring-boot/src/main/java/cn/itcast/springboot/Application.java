package cn.itcast.springboot;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 如果是一个spring boot项目则一定要配置一个引导类;
 * 该类必须添加@SpringBootApplication；能对该类所在的包及其子包进行注解扫描
 */
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        //SpringApplication.run(Application.class, args);
        SpringApplication springApplication = new SpringApplication(Application.class);
        //启动的时候不启用banner
        springApplication.setBannerMode(Banner.Mode.OFF);
        springApplication.run(args);
    }
}
