package com.zxq.elkftp.quartz;

import com.zxq.elkftp.service.ELKFTPService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * 定时任务
 *
 * @author ZhaoXQ
 */
@Component
public class ELKFTPQuartz {
    @Autowired
    private ELKFTPService elkftpService;

    @Scheduled(cron = "? 0 16 * * ?")
    private Object startFtp() {
        return elkftpService.startFtp();
    }

}
