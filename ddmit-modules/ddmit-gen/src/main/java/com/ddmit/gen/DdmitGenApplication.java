package com.ddmit.gen;

import com.ddmit.common.security.annotation.EnableCustomConfig;
import com.ddmit.common.security.annotation.EnableRyFeignClients;
import com.ddmit.common.swagger.annotation.EnableCustomSwagger2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 代码生成
 *
 * @author ddmit
 */
@EnableCustomConfig
@EnableCustomSwagger2
@EnableRyFeignClients
@SpringBootApplication
public class DdmitGenApplication {
    public static void main(String[] args) {
        SpringApplication.run(DdmitGenApplication.class, args);
        System.out.println("(♥◠‿◠)ﾉﾞ  代码生成模块启动成功   ლ(´ڡ`ლ)ﾞ  \n");
    }
}
