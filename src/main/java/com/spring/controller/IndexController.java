package com.spring.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    private static final Logger LOGGER = LogManager.getLogger(IndexController.class.getName());
    @GetMapping("/")
    public String index() {
        LOGGER.debug("debug message");
        LOGGER.info("info message");
        LOGGER.error("error message", new NullPointerException());

        return "index";
    }
}
