package study.springcloud.config.support;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication(scanBasePackages = "study.springcloud.config")
public class SpringBootCfg {

}
