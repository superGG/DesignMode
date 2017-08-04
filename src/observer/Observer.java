package observer;

/**
 * 观察者，设定所有观察者所必须实现的方法
 * @author Kellan
 * 2017年8月4日
 */
public interface Observer {
	public void update(float temperature, float humidity, float pressure);
}
