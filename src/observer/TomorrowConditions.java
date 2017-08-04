package observer;

/**
 * 观察者2，负责接收Subject的信息并显示
 * @author Kellan
 * 2017年8月4日
 */
public class TomorrowConditions implements Observer{
	
	private float Temperature;
	private float Humidity;
	private float Pressure;
	
	/**
	 * 实现观察者Observer的方法
	 */
	public void update(float temperature, float humidity,float pressure) {
		this.Temperature = temperature + 30;
		this.Humidity = humidity + 30;
		this.Pressure = pressure + 30;
		display();
	}
	public void display() {
		System.out.println("*******Tomorrow Temperature:" + Temperature + "********");
		System.out.println("*******Tomorrow Humidity:" + Humidity + "********");
		System.out.println("*******Tomorrow Pressure:" + Pressure + "********");
	}

	
}
