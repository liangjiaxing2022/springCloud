package springcloud.eureka_provider_pt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableDiscoveryClient
@SpringBootApplication
public class EurekaProviderPtApplication {
	public static void main(String[] args) {
		SpringApplication.run(EurekaProviderPtApplication.class, args);
	}
}
