package springcloud.config_client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class EnvTestController {
    @Autowired
    private Environment env;

    @RequestMapping("/from2")
    public String from(){
        return env.getProperty("from","undefined");
    }

}
