package com.imooc.order;

import org.junit.Test;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.stereotype.Component;

@Component
@EnableBinding()
public class MqSenderTest extends  OrderApplicationTests{

    @Autowired
    private AmqpTemplate amqpTemplate;


    @Test
    public void send(){
        amqpTemplate.convertAndSend("myQueue","now:"+System.currentTimeMillis());
    }

    @Test
    public void sendOrder(){
        amqpTemplate.convertAndSend("myOrder","computer","now:"+System.currentTimeMillis());
    }

    @Test
    public  void sendOutput(){

    }
}
