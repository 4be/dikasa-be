package com.ews.pos.dikasa.controller;


import com.ews.pos.dikasa.service.CreateMerchant;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping(value = "/api/")
public class MerchantController {

        @Autowired
        CreateMerchant createMerchant;

        @PostMapping(value = "/createMerchant/{name}")
        public Object addsMerchant(@PathVariable("name") String name){
                return createMerchant.addMerchant(name);
        }

        @RequestMapping(value = "/getMerchant")
        public Object selectsMerchant(){
                return createMerchant.selectMerchant();

        }


}
