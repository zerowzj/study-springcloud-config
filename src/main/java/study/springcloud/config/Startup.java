package study.springcloud.config;

import org.springframework.boot.SpringApplication;
import study.springcloud.config.support.SpringBootCfg;

public class Startup {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootCfg.class, args);
    }
}
