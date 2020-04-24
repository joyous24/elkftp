package com.zxq.elkftp.controller;

import com.zxq.elkftp.service.ELKFTPService;
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
        return elkftpService.startFtp();
    }
}
