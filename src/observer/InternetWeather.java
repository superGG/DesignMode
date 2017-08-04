package observer;

public class InternetWeather {

	public static void main(String[] args) {
		CurrentConditions currentConditions = new CurrentConditions();
		TomorrowConditions tomorrowConditions = new TomorrowConditions();
		WeatherData weatherData = new WeatherData();
		
		weatherData.registerObserver(currentConditions);
		weatherData.registerObserver(tomorrowConditions);
		weatherData.setData(30,30,30);
		
	}
	
}
