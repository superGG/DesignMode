package observer;

/**
 * 观察者1，负责接收Subject的信息并显示
 * @author Kellan
 * 2017年8月4日
 */
public class CurrentConditions implements Observer{
	
	private float Temperature;
	private float Humidity;
	private float Pressure;
	
	/**
	 * 实现观察者Observer的方法
	 */
	public void update(float temperature, float humidity,float pressure) {
		this.Temperature = temperature;
		this.Humidity = humidity;
		this.Pressure = pressure;
		display();
	}
	
	public void display() {
		System.out.println("*******Today Temperature:" + Temperature + "********");
		System.out.println("*******Today Humidity:" + Humidity + "********");
		System.out.println("*******Today Pressure:" + Pressure + "********");
	}

	
}
