package com.example.demo.controller;


import com.example.demo.Entity.Calendar;
import com.example.demo.Entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
@RestController
public class UserController {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/user")
    public User getList2()
    {
        String url = "http://jsonplaceholder.typicode.com/posts/1";
        User object = restTemplate.getForObject(url,User.class);
        //System.out.println(object);
        return object;

    }

}
