package academy.wakanda.indicadorfilmes.config;

import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableFeignClients(basePackages = "academy.wakanda.indicadorfilmes")
public class FeignConfig {

}
