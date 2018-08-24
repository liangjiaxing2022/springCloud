package springcloud.spring_cloud_stream_consumer_group;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

/*
消费者应用
绑定 hello 主题
 */
@EnableBinding(value = {Sink.class})
public class SinkReceiver {
    private static Logger logger = LoggerFactory.getLogger(SinkReceiver.class);

    @StreamListener("shendu_input")
    public void receive(String s){
        logger.info("received: "+s);
    }
}


















