package observer;

import java.util.ArrayList;

/**
 * 天气检测站类。
 * 实现Subject的 注册registerObserver, 移除removeObserver, 通知notifyObservers三个方法。
 * 2017/8/4.
 * Created by Kellan.
 */
public class WeatherData implements Subject{

	private float Temperature; //温度
	private float Humidity;  //湿度
	private float Pressure;  //气压
	//用于存放所有注册的观察者Observer
	private ArrayList<Observer> observerList;
	 
	/*
	 * 构造函数
	 */
	public WeatherData() {
		this.observerList = new ArrayList<Observer>();
	}
	
	public float getTemperature() {
		return Temperature;
	}
	
	public float getHumidity() {
		return Humidity;
	}
	
	public float getPressure() {
		return Pressure;
	}
	
//	public void dataChange() {
//		for(Observer o : observerList) {
//			o.update(getTemperature(),getHumidity(),getPressure());
//		}
//	}
	
	/*
	 * 设置数据信息，并且通知所有观察者改变信息
	 */
	public void setData(float temperature, float humidity, float pressure){
		this.Temperature = temperature;
		this.Humidity = humidity;
		this.Pressure = pressure;
		notifyObservers();
	}
	/*
	 * 观察者注册
	 */
	public void registerObserver(Observer o) {
		if (!observerList.contains(o)) {
			observerList.add(o);
		}
	}
	/*
	 * 移除观察者
	 */
	public void removeObserver(Observer o) {
		if (observerList.contains(o)) {
			observerList.remove(o);
		}
	}
	/*
	 * 通知观察者
	 */
	public void notifyObservers() {
		for(Observer o : observerList) {
			o.update(getTemperature(),getHumidity(),getPressure());
		}
	}
	
}
