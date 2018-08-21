package com.imooc.order.message;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.Exchange;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.QueueBinding;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * 接受mq消息
 */
@Slf4j
@Component
public class MqReceiver {


    //1.@RabbitListener(queues = "myQueue")
    //2.自动创建队列 @RabbitListener(queuesToDeclare = @Queue("myQueue"))
    //3.自动创建，Exchange和Queue绑定
    @RabbitListener(bindings =@QueueBinding(
            exchange = @Exchange("myOrder"),
            key = "computer",
            value = @Queue("computerOrder")
           ))
    public void processComputer(String message){
        log.info("Computer MqReceiver:{}",message);
    }

    @RabbitListener(bindings =@QueueBinding(
            exchange = @Exchange("myOrder"),
            key = "fruit",
            value = @Queue("fruitOrder")
    ))
    public void processfruit(String message){
        log.info("Fruit MqReceiver:{}",message);
    }
}
