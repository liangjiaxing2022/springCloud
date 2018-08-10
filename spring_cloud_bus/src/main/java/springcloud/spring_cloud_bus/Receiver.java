package springcloud.spring_cloud_bus;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "hello")
public class Receiver {
    public void process(String hello){
        System.out.println("recevier : "+hello);
    }
}
