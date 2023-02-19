package com.ews.pos.dikasa.service;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class CreateMerchant {


        JdbcTemplate jdbcTemplate;

        public Object addMerchant(String name){
                String sql = "CREATE SCHEMA " + name;
                jdbcTemplate.execute(sql);
                return "new schema" + name;
        }

        public Object selectMerchant(){

                return "lol";
        }

}
