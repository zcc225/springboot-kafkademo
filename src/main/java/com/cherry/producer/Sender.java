package com.cherry.producer;

import com.cherry.model.Message;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Component;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.util.concurrent.ListenableFutureCallback;

import java.time.LocalDateTime;

/**
 * Created by Administrator on 2017/7/26 0026.
 */
@Component
public class Sender {

    private Gson gson = new GsonBuilder().create();

    @Autowired
    private KafkaTemplate kafkaTemplate;

    public void sendMessage(){
        Message msg = new Message();
        msg.setId(System.currentTimeMillis());
        msg.setMsg("Hello World---1111");
        msg.setSendTime(LocalDateTime.now());


        ListenableFuture<SendResult<String, String>> future = kafkaTemplate.send("demo", gson.toJson(msg, Message.class));
        future.addCallback(new ListenableFutureCallback<SendResult<String, String>>() {
            @Override
            public void onFailure(Throwable ex) {
                ex.printStackTrace();
            }

            @Override
            public void onSuccess(SendResult<String, String> result) {
                System.out.println("test" + " offset : " +  result.getRecordMetadata().offset());
            }
        });
    }
}
