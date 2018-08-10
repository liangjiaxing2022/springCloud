package springcloud.feign;

import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;
import springcloud.helloserviceapi.HelloService;
import springcloud.helloserviceapi.User;

@Component
@RequestMapping("fallback/helloController")
public class HelloServiceFallback implements HelloServiceExtends{


    @Override
    public String hello() {
        return "error";
    }

    @Override
    public String hello(String name) {
        return null;
    }

    @Override
    public User hello(String name, Integer age) {
        return null;
    }
}
