package starter;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("convert.mensaje")
public class ConvertProperties {
	private double temperature = 0.0;

	public double getTemperature() {
		return temperature;
	}

	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}

}