package springcloud.sleuth_two;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SleuthTwoController {
    private Logger logger = LoggerFactory.getLogger(getClass());
    @RequestMapping(value = "/trace-2",method = RequestMethod.GET)
    public String trace(){
        logger.info("========<call trace-2>=======");
        return "Trace";
    }

}
