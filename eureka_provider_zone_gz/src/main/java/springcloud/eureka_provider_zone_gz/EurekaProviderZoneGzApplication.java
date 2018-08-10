package springcloud.eureka_provider_zone_gz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class EurekaProviderZoneGzApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaProviderZoneGzApplication.class, args);
	}
}
