package springcloud.spring_cloud_stream_partition_consumer2;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface Receiver {
    @Input("shenduinput")
    SubscribableChannel input();
}
