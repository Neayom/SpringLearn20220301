package com.dlnu;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by lgx on 2022/3/6.
 * log4j+slf4j
 */
public class Log4jMain {
    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(Log4jMain.class);
        System.out.println(logger.getClass());
        logger.info("崇尚开源的开发组:log4j");

    }
}
