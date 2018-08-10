package springcloud.feign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import springcloud.helloserviceapi.User;

@RestController
public class HelloController {
    @Autowired
    protected HelloServiceExtends helloServiceExtends;

    @RequestMapping(value = "/feign-consumer",method = RequestMethod.GET)
    public String helloConsumer(){
        return helloServiceExtends.hello();
    }

    @RequestMapping(value = "/feign-consumer2",method = RequestMethod.GET)
    public void helloConsumer2(){
        User user = new User();
        user.setAge(24);
        user.setName("shendu");
     //   System.out.println(helloService.hello(user));
        System.out.println(helloServiceExtends.hello("shendu"));
        System.out.println(helloServiceExtends.hello("shendu",24));
    }
}
