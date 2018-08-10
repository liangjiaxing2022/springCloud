package springcloud.helloserviceapi;
import org.springframework.web.bind.annotation.*;

@RequestMapping("helloController")
public interface HelloService {

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    String hello();

    @RequestMapping(value = "/hello1",method = RequestMethod.GET)
    String hello(@RequestParam("name") String name);

    @RequestMapping(value = "/hello2",method = RequestMethod.GET)
    User hello(@RequestHeader("name") String name, @RequestHeader("age") Integer age);

/*    @RequestMapping(value = "/hello3",method = RequestMethod.POST)
    String hello(@RequestBody User user);*/

}
