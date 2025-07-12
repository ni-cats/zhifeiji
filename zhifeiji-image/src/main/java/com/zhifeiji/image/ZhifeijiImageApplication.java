package com.zhifeiji.image;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * zhifeiji-image 项目
 */

@Slf4j
@SpringBootApplication
@ServletComponentScan
@EnableTransactionManagement
public class ZhifeijiImageApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZhifeijiImageApplication.class, args);
        log.info("项目启动成功！");
    }
}
