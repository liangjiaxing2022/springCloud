package springcloud.hystrix;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCollapser;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.netflix.hystrix.contrib.javanica.cache.annotation.CacheKey;
import com.netflix.hystrix.contrib.javanica.cache.annotation.CacheRemove;
import com.netflix.hystrix.contrib.javanica.cache.annotation.CacheResult;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;
import springcloud.hystrix.rx.User;

// 笔记，该类无效
public class UserService {

    @Autowired
    RestTemplate restTemplate;

    @HystrixCollapser(batchMethod = "findAll",collapserProperties = {
            @HystrixProperty(name = "timerDelayInMilliseconds",value = "100")
    })
    public User find(Long id){
        return null;
    }

    @HystrixCommand
    public java.util.List<User> findAll(java.util.List<Long> ids){
        return restTemplate.getForObject("http://USER-SERVICE/users?ids={1}"
                ,java.util.List.class,
                StringUtils.join(ids,","));
    }

}
