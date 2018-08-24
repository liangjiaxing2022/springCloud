package springcloud.spring_cloud_stream_sender;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface SinkSender {
    @Output("shenduoutput")
    MessageChannel output();
}
