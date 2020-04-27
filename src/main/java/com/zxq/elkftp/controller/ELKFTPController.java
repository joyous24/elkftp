package com.zxq.elkftp.controller;

import com.zxq.elkftp.service.ELKFTPService;
import com.zxq.elkftp.util.StatusUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 控制层
 *
 * @author zxq
 */
@RestController
public class ELKFTPController {

    @Autowired
    private ELKFTPService elkftpService;

    @RequestMapping("/startFtp")
    private Object startFtp() {
        if (StatusUtil.status.get()) {
            return "有未完成的下载任务，稍后再试。";
        }

        new Thread(() -> {
            elkftpService.startFtp();
        }).start();
        return "任务下载中。。。";
    }
}
