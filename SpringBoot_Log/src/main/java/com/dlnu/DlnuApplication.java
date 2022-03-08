package com.dlnu;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DlnuApplication {

    static Logger logger = LoggerFactory.getLogger(DlnuApplication.class);
    public static void main(String[] args) {
       logger.trace("追踪");
        logger.debug("调试");
        logger.info("信息");
        logger.warn("警告");
        logger.error("异常");
        SpringApplication.run(DlnuApplication.class, args);
    }

}
