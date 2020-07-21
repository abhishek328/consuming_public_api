package com.example.demo.controller;

import com.example.demo.Entity.Covid19;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class Covid19Controller {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/datacovid19")
    public Covid19 getList1()
    {
        String url = "https://api.covid19india.org/data.json";
        Covid19 object = restTemplate.getForObject(url,Covid19.class);
        //System.out.println(object);
        return object;

    }
   @GetMapping("/covid19")
    public Object getList2()
    {
        String url = "https://api.covid19india.org/data.json";
        Object object = restTemplate.getForObject(url,Object.class);
        return object;

    }

}
