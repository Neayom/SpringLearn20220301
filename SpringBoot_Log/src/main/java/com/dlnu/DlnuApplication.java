package com.dlnu;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DlnuApplication {

    static Logger logger = LoggerFactory.getLogger(DlnuApplication.class);
    public static void main(String[] args) {
        SpringApplication.run(DlnuApplication.class, args);
    }

}
