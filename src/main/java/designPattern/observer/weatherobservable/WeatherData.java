package designPattern.observer.weatherobservable;
	
import java.util.Observable;
	
public class WeatherData extends Observable {
	private float temperature;
	private float humidity;
	private float pressure;
	
	public WeatherData() { }
	
	public void measurementsChanged() {
		setChanged();
		notifyObservers();


	}

//	public void measurementsChanged() {
//
//		float temp = getTemperature();
//		float humidity = getHumidity();
//		float pressure = getPressure();
//
//		currentConditionsDisplay.update(temp, humidity, pressure);
//		statisticsDisplay.update(temp, humidity, pressure);
//		forecastDisplay.update(temp, humidity, pressure);
//	}


	public void setMeasurements(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}
	
	public float getTemperature() {
		return temperature;
	}
	
	public float getHumidity() {
		return humidity;
	}
	
	public float getPressure() {
		return pressure;
	}
}
