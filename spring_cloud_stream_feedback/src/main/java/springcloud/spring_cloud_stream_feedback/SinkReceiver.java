package springcloud.spring_cloud_stream_feedback;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.SubscribableChannel;

public interface SinkReceiver {
    @Input("shendu_input")
    SubscribableChannel input();
}
