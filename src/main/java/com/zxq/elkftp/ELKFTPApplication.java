package com.zxq.elkftp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * 系统服务运行入口
 *
 * @author zhaoxq
 */
@EnableScheduling
@SpringBootApplication
public class ELKFTPApplication {

    public static void main(String[] args) {
        SpringApplication.run(ELKFTPApplication.class, args);
    }

}
