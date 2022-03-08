package com.dlnu;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Created by lgx on 2022/3/6.
 */
public class julMain {
    public static void main(String[] args) {
        Log log = LogFactory.getLog(julMain.class);
        System.out.println(log.getClass());
        log.info("崇尚官方的日志");
    }
}
