package com.example.demo.listener;

import com.example.demo.entity.UserInfo;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chengjiapeng on 2018/5/6.
 */
@Component
public class UserInfoListener {


    @KafkaListener(topics = { "topic-cjp" }, containerFactory = "kafkaUserInfoContainerFactory")
    public void listen(List<String> data) {
        List<UserInfo> userInfoList = new ArrayList<>();
        data.forEach((v)->{
            System.out.println("v:"+v);
            JSONObject obj = JSONObject.fromObject(v);
            String brower = obj.getString("browser");
            String os = obj.getString("os");
            String ip = obj.getString("ip");
            String time = obj.getString("time");
            UserInfo userInfo = new UserInfo();
            userInfo.setBrower(brower);
            userInfo.setOs(os);
            userInfo.setIp(ip);
            userInfo.setTime(time);
            userInfoList.add(userInfo);
            System.out.println("信息:"+obj);
        });
//		userInfoDao.batchInsert(userInfoList);
    }
}
