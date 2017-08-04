package observer;

/**
 * 观察者模式的模拟实现
 * 模拟： 天气检测站为被观察者，当天气信息发生改变时，统一通知所有已经注册的观察者。
 * @author Kellan
 * 2017年8月4日
 */
public class InternetWeather {

	public static void main(String[] args) {
		CurrentConditions currentConditions = new CurrentConditions(); //观察者1
		TomorrowConditions tomorrowConditions = new TomorrowConditions(); //观察者2
		WeatherData weatherData = new WeatherData(); //被观察
		
		weatherData.registerObserver(currentConditions);
		weatherData.registerObserver(tomorrowConditions);
		weatherData.setData(30,30,30);
		
	}
	
}
