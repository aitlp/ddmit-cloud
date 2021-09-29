package com.ddmit.job;

import com.ddmit.common.security.annotation.EnableCustomConfig;
import com.ddmit.common.security.annotation.EnableRyFeignClients;
import com.ddmit.common.swagger.annotation.EnableCustomSwagger2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 定时任务
 *
 * @author ddmit
 */
@EnableCustomConfig
@EnableCustomSwagger2
@EnableRyFeignClients
@SpringBootApplication
public class DdmitJobApplication {
    public static void main(String[] args) {
        SpringApplication.run(DdmitJobApplication.class, args);
        System.out.println("(♥◠‿◠)ﾉﾞ  定时任务模块启动成功   ლ(´ڡ`ლ)ﾞ  \n");
    }
}
