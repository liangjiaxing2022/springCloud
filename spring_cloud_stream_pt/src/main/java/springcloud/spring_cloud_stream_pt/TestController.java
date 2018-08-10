package springcloud.spring_cloud_stream_pt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    private SinkSender sinkSender;

    @RequestMapping("/test")
    public void test(){
        sinkSender.output().send(MessageBuilder.withPayload("{\"name\":\"shendu\",\"age\":30}").build());
    }

}
