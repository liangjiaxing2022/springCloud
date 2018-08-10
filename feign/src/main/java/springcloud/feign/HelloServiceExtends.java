package springcloud.feign;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.*;
import springcloud.helloserviceapi.HelloService;
import springcloud.helloserviceapi.User;

@FeignClient(name = "hello-service",fallback = HelloServiceFallback.class)
public interface HelloServiceExtends extends HelloService{

}

