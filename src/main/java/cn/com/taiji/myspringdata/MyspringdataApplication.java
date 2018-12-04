package cn.com.taiji.myspringdata;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class MyspringdataApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyspringdataApplication.class, args);
    }
}
