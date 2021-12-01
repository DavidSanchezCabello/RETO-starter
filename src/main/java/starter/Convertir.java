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

	public String mensajeConversion(String index) {
		switch (index) {
		case "ceAfa":
			return "La conversión de cesius a fahrenheit es:" + celsiusAFahrenheit(temperature);
			
		case "faAce":
			return "La conversión de fahrenheit a cesius es:" + fahrenheitACelsius(temperature);
		default:
			return  "No hay datos correctos";
		}
	}

	public double getTemperature() {
		return temperature;
	}

	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}	

}