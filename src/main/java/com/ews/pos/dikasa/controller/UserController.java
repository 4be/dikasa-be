package com.ews.pos.dikasa.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@RequestMapping("/api2/")
public class UserController {

        @RequestMapping("/test")
        public String test(){
                return "hello world";
        }


}
        