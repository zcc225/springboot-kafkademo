package com.cherry.consumer;

import com.cherry.model.Message;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.springframework.kafka.annotation.KafkaListener;

import java.time.LocalDateTime;

/**
 * Created by Administrator on 2017/7/26 0026.
 */
public class Receiver {

    private Gson gson = new GsonBuilder().create();

    @KafkaListener(topics="zcctest")
    public void processMessage(String content){
//        Message msg = gson.fromJson(content, Message.class);
        System.out.println("++++++++++++++++++++="+content);
    }
}
