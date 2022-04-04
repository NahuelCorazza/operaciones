package tec.colmena.operaciones;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
import org.springframework.context.annotation.Bean;


@Configuration
public class RestTemplateConfig {

	@Bean("clienteRest")
	public RestTemplate registrarRestTemplate() { /* retorna la instacia del objeto */
		
		return new RestTemplate();
	}
	
}
