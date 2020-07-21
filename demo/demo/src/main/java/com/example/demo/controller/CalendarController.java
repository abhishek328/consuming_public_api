package com.example.demo.controller;

import com.example.demo.Entity.Calendar;
import com.example.demo.Entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
@RestController
public class CalendarController {


        @Autowired
        private RestTemplate restTemplate;

        @GetMapping("/calander")
        public Calendar getList1()
        {
            String url = "http://calapi.inadiutorium.cz/api/v0/en/calendars/general-en/tomorrow";
            Calendar object = restTemplate.getForObject(url,Calendar.class);
            //System.out.println(object);
            return object;

        }






}
