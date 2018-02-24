package com.cherry;

import com.cherry.producer.Sender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class App {

    public static void main(String[] args) throws InterruptedException{
        ApplicationContext ctx = SpringApplication.run(App.class, args);
        Sender sender = ctx.getBean(Sender.class);
        sender.sendMessage();
    }
}
