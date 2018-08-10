package springcloud.eureka_provider_pt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;
import springcloud.helloserviceapi.HelloService;

@RestController
public class HelloController implements HelloService{

    @Override
    public String hello() {
        return "Hello World eueka_provider gz1";
    }

    @Override
    public String hello(@RequestParam("name") String name) {
        return "hello "+name;
    }

    @Override
    public springcloud.helloserviceapi.User hello(@RequestHeader("name") String name, @RequestHeader("age") Integer age) {
        springcloud.helloserviceapi.User user=new  springcloud.helloserviceapi.User();
        user.setAge(age);
        user.setName(name);
        return user;
    }

  /*  @Override
    public String hello(@RequestBody springcloud.helloserviceapi.User user) {
        return "hello "+user.getName()+", "+user.getAge();
    }*/
}























