package co.edu.udea.diploma.microservicios.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClients;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

import co.edu.udea.diploma.microservicios.gateway.configuration.RibbonConfiguration;

@EnableDiscoveryClient
@SpringBootApplication
@EnableZuulProxy
@EnableEurekaClient
@RibbonClients(defaultConfiguration = RibbonConfiguration.class)
public class DipMicrApigateway2Application {

	public static void main(String[] args) {
		SpringApplication.run(DipMicrApigateway2Application.class, args);
	}

}
