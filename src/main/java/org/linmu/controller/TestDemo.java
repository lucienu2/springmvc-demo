package org.linmu.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by linmu on 15-1-30.
 */
@Controller
@RequestMapping("/test")
public class TestDemo {
    
    private Logger logger = LoggerFactory.getLogger(TestDemo.class);
    
    @RequestMapping("/index.do")
    public ModelAndView toIndex123() {
        logger.info("now turn to index.ftl page");
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        modelAndView.addObject("msg", "this is test demo");
        return modelAndView;
    }

    @RequestMapping("/test.do")
    public String testdemo() {
        logger.info("now turn to index.ftl page");
        return "index";
    }
}
