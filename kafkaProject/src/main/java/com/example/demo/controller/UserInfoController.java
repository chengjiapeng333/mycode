package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by chengjiapeng on 2018/5/6.
 */
@RestController
public class UserInfoController {
    @Autowired
    private KafkaTemplate<String, String> template;

    @PostMapping("/sendUserInfo")
    public void sendUserInfo(String info) {
        if(!StringUtils.isEmpty(info)) {
            template.send("topic-cjp", info);
        }else {
            System.out.println("传入的信息为空");
        }
    }
}
