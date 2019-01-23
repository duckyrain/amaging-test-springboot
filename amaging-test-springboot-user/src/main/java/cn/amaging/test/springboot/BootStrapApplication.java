package cn.amaging.test.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by DuQiyu on 2019/1/23 11:56.
 */
@SpringBootApplication
@ComponentScan(value = "cn.amaging")
public class BootStrapApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootStrapApplication.class, args);
    }
}

