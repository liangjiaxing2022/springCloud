package springcloud.spring_cloud_stream_sender;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.context.annotation.Bean;
import org.springframework.integration.annotation.InboundChannelAdapter;
import org.springframework.integration.annotation.Poller;
import org.springframework.integration.core.MessageSource;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.GenericMessage;

import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;

@EnableBinding(value = {SinkSender.class})
public class App2 {
    private static Logger logger = LoggerFactory.getLogger(App2.class);

    private static AtomicInteger atomicInteger = new AtomicInteger(1);

    private static final String one = "{\"id\":\"1\",\"name\":\"shendu\",\"age\":30}";

    private static final String two = "{\"id\":\"2\",\"name\":\"shendu\",\"age\":30}";

    private static final String three = "{\"id\":\"3\",\"name\":\"shendu\",\"age\":30}";

    private static final String four = "{\"id\":\"4\",\"name\":\"shendu\",\"age\":30}";

    @Bean
    @InboundChannelAdapter(value = "shenduoutput",poller = @Poller(fixedDelay = "2000"))
    public MessageSource<String> timerMessageSource(){
        return  new MessageSource<String>() {
            @Override
            public Message<String> receive() {
                int i = atomicInteger.addAndGet(1);

                if(i%4==0){
                    return new GenericMessage(one);
                }else if(i%4==1){
                    return new GenericMessage(two);
                }else if(i%4==2){
                    return new GenericMessage(three);
                }else{
                    return new GenericMessage(four);
                }


            }
        };
    }


}
