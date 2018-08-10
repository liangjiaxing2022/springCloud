package springcloud.eureka_provider_zone_gz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    private DiscoveryClient client;
    @Qualifier("eurekaRegistration")
    @Autowired
    private org.springframework.cloud.client.serviceregistry.Registration eurekaRegistration;

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String index(){
        System.out.println("serviceId:"+eurekaRegistration.getServiceId()+"  hostName:"+eurekaRegistration.getHost());
        return "Hello World eueka_provider_zone hz1";
    }
}






















