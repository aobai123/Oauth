package com.example.demo.controller;

import com.example.demo.entity.ResponseMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

public class TestController {
    Logger log=LoggerFactory.getLogger(TestController.class);

    @RequestMapping("/demo")
    @ResponseBody
    public ResponseMessage getDemo(){
        Authentication authentication= SecurityContextHolder.getContext().getAuthentication();
        log.info(authentication.toString());
        return ResponseMessage.success();
    }


}
