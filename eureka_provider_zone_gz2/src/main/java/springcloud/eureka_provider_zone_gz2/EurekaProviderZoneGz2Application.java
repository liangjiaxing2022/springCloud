package springcloud.eureka_provider_zone_gz2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaProviderZoneGz2Application {

	public static void main(String[] args) {
		SpringApplication.run(EurekaProviderZoneGz2Application.class, args);
	}
}
