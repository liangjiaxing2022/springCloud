package springcloud.spring_cloud_stream_consumer_group;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Processor;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.context.annotation.Bean;
import org.springframework.integration.annotation.InboundChannelAdapter;
import org.springframework.integration.annotation.Poller;
import org.springframework.integration.core.MessageSource;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.GenericMessage;

import java.util.Date;

/*
消息生产者
 */
@EnableBinding(value = {Source.class})
public class SinkSender {
    private static Logger logger = LoggerFactory.getLogger(SinkSender.class);

    @Bean
    @InboundChannelAdapter(value = Processor.OUTPUT,poller = @Poller(fixedDelay = "2000"))
    public MessageSource<String> timerMessageSource(){
        return  new MessageSource<String>() {
            @Override
            public Message<String> receive() {
                return new GenericMessage("{\"name\":\"shendu\",\"age\":30}");
            }
        };
    }

}
