package com.ddmit.system;

import com.ddmit.common.security.annotation.EnableCustomConfig;
import com.ddmit.common.security.annotation.EnableRyFeignClients;
import com.ddmit.common.swagger.annotation.EnableCustomSwagger2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 系统模块
 *
 * @author ddmit
 */
@EnableCustomConfig
@EnableCustomSwagger2
@EnableRyFeignClients
@SpringBootApplication
public class DdmitSystemApplication {
    public static void main(String[] args) {
        SpringApplication.run(DdmitSystemApplication.class, args);
        System.out.println("(♥◠‿◠)ﾉﾞ  系统模块启动成功   ლ(´ڡ`ლ)ﾞ  \n");
    }
}
