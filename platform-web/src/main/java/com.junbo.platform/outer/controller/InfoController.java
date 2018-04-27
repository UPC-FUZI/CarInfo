package com.junbo.platform.outer.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @AUTHOR Zhong Xingfu
 * @DATE 2018/4/27 15:52
 * @Explain
 */
@RestController
@RequestMapping(value = "/info")
public class InfoController {

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public String getInfo(){
        return "ZXF";
    }
}
