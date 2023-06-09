package springcloud.spring_cloud_stream_feedback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Processor;
import org.springframework.messaging.handler.annotation.SendTo;

@EnableBinding(value = {SinkReceiver.class})
public class App1 {
    private static Logger logger = LoggerFactory.getLogger(App1.class);

    @StreamListener("shendu_output")
    @SendTo({"shendu_input"})
    public Object receiveFromInput(Object payload){
        logger.info("received: "+payload);
        return "From Input Channel Return - "+payload;
    }
}
