package springcloud.spring_cloud_stream_pt;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.MessageChannel;

public interface SinkSender {
    @Output(Sink.INPUT)
    MessageChannel output();
}
