package org.distributed_springcloud.server_three;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class ServerThreeApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerThreeApplication.class, args);
	}

}
