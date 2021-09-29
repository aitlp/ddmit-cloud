package com.ddmit.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * 网关启动程序
 *
 * @author Ddmit
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class DdmitGatewayApplication {
    public static void main(String[] args) {
        SpringApplication.run(DdmitGatewayApplication.class, args);
        System.out.println("(♥◠‿◠)ﾉﾞ  Ddmit网关启动成功   ლ(´ڡ`ლ)ﾞ  \n");
    }
}
