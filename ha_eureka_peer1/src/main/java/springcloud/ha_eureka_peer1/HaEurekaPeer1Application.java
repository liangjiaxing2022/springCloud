package springcloud.ha_eureka_peer1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class HaEurekaPeer1Application {

	public static void main(String[] args) {
		SpringApplication.run(HaEurekaPeer1Application.class, args);
	}
}
