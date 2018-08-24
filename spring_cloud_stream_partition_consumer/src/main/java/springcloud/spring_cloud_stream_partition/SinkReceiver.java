package springcloud.spring_cloud_stream_partition;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;

@EnableBinding(value = {Receiver.class})
public class SinkReceiver {
    private static Logger logger = LoggerFactory.getLogger(SinkReceiver.class);

    @StreamListener("shenduinput")
    public void receive(User payload){
        logger.info("received： "+payload);
    }

}
