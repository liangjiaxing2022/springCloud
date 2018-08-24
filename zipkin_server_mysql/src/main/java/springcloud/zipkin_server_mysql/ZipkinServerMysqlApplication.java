package springcloud.zipkin_server_mysql;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import zipkin.server.internal.EnableZipkinServer;
import zipkin.storage.mysql.MySQLStorage;

import javax.sql.DataSource;

@EnableZipkinServer
@SpringBootApplication
public class ZipkinServerMysqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZipkinServerMysqlApplication.class, args);
	}

	@Bean
	@Primary
	public MySQLStorage mySQLStorage(DataSource datasource) {
		return MySQLStorage.builder().datasource(datasource).executor(Runnable::run).build();
	}

}
