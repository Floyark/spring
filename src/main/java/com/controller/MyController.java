package com.controller;


import org.apache.commons.logging.Log;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

public class MyController {

    static Logger logger=Logger.getLogger(MyController.class);

    public String ore(){
        PropertyConfigurator.configure(ClassLoader.getSystemResource("log4j.properties"));
        System.console().writer().println("访问");
        logger.debug("from debug");
        logger.error("from error");
        return "index.jsp";
    }
}
