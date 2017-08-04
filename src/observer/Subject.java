package observer;

/**
 * 被观察对象。必须实现注册、移除、通知三个对观察者操作的方法
 * @author Kellan
 * 2017年8月4日
 */
public interface Subject {
	public void registerObserver(Observer o);
	public void removeObserver(Observer o);
	public void notifyObservers();
}
