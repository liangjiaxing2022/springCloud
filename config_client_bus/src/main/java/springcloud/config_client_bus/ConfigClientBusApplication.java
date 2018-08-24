package springcloud.config_client_bus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ConfigClientBusApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder(ConfigClientBusApplication.class).web(true).run(args);
	}
}
