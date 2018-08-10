package springcloud.hystrix;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.command.AsyncResult;
import com.netflix.hystrix.exception.HystrixBadRequestException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import rx.Observable;

import java.util.concurrent.Future;

@Service
public class HelloService {
    @Autowired
    RestTemplate restTemplate;

    //同步
    @HystrixCommand(commandKey = "helloService",
            groupKey = "hellogroup",
            threadPoolKey = "hellothread",
            fallbackMethod = "helloFallback",
            ignoreExceptions = {HystrixBadRequestException.class})
    public String helloService(){
        return restTemplate.getForEntity("http://HELLO-SERVICE/hello",String.class).getBody();
    }

    //异步
    @HystrixCommand(fallbackMethod = "helloFallback")
    public Future<String> helloServiceAsync() {



        return new AsyncResult<String>() {
            @Override
            public String invoke() {
                return restTemplate.getForEntity("http://HELLO-SERVICE/hello",String.class).getBody();
            }
        };
    }

    public String helloFallback(Throwable e){
        return "error:"+e.getMessage();
    }




}
