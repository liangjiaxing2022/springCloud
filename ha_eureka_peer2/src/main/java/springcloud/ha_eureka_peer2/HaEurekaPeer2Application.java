package springcloud.ha_eureka_peer2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class HaEurekaPeer2Application {

	public static void main(String[] args) {
		SpringApplication.run(HaEurekaPeer2Application.class, args);
	}
}
