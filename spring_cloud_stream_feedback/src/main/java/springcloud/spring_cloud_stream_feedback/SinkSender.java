package springcloud.spring_cloud_stream_feedback;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface SinkSender {
    @Output("shendu_output")
    MessageChannel output();
}
