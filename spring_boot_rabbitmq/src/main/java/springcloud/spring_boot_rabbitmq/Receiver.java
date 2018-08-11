package springcloud.spring_boot_rabbitmq;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "shendu")
public class Receiver {
    @RabbitHandler
    public void process(String shendu){
        System.out.println("receiver: "+shendu);
    }
}
