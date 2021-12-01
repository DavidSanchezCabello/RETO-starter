package starter;


public class Convertir {

	private double temperature;
	
	public Convertir(double temperature) {
		this.setTemperature(temperature);
	}

	public double celsiusAFahrenheit(double celsius) {
		
		return (celsius * 1.8f) + 32;
	}
	
	public double fahrenheitACelsius(double fahrenheit) {

		return (fahrenheit - 32) / 1.8f;
	}

	public String mensajeConversion() {
		String mensaje = "";
		switch (temperature+"") {
		case "ceAfa":
			mensaje = "La conversión de cesius a fahrenheit es:" + celsiusAFahrenheit(temperature);
			break;
		case "faAce":
			mensaje = "La conversión de fahrenheit a cesius es:" + fahrenheitACelsius(temperature);
			break;
		default:
			mensaje = "No hay datos correctos";
			break;
		}
		return mensaje;
	}

	public double getTemperature() {
		return temperature;
	}

	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}	

}