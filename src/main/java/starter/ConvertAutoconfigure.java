package starter;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnClass(Convertir.class)
@EnableConfigurationProperties(ConvertProperties.class)
public class ConvertAutoconfigure {

	private final ConvertProperties properties;
	
	public ConvertAutoconfigure(ConvertProperties properties) {
		this.properties = properties;
	}
	
	@Bean
	public Convertir conversor() {
		System.out.println("Temperatura: " + properties.getTemperature());
		return new Convertir(properties.getTemperature());
	}
	
}