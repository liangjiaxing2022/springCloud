package springcloud.sleuth_one;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class SleuthOneController {
    private Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    protected RestTemplate restTemplate;
    @RequestMapping(value = "/trace-1",method = RequestMethod.GET)
    public String trace(){
        logger.info("=====call trace-1=======");
        return restTemplate.getForEntity("http://sleuthtwo/trace-2",String.class).getBody();
    }
}
