package springcloud.spring_cloud_bus;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class Sender {
    private AmqpTemplate rabbitTemplate;

    public void send(){
        String context = "hello "+new Date();
        System.out.println("sender ： "+context);
        this.rabbitTemplate.convertAndSend("hello",context);
    }

}
