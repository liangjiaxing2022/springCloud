package springcloud.spring_boot_rabbitmq;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

/*
创建消息生成者sender
AmqpTemplate 接口定义了一套针对AMQP协议的基础操作
 */
@Component
public class Sender {
    @Autowired
    private AmqpTemplate amqpTemplate;

    public void send(){
        String context = "hello "+ new Date();
        System.out.println("sender : "+context);
        this.amqpTemplate.convertAndSend("shendu",context);
    }

}
