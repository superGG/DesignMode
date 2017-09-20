package singleton;

/**
 * 单例模式 模拟巧克力工厂 在只有一个锅的情况下 加热 巧克力
 * 
 * @author Kellan 2017年8月4日
 */
public class ChocolateFactory {

	private static ChocolateFactory uniqueInstance = null;

	private boolean empty;
	private boolean boiled;

	private ChocolateFactory() {
		empty = true;
		boiled = false;
	}

	public static synchronized ChocolateFactory getInstance() {
		if (uniqueInstance == null) {
			uniqueInstance = new ChocolateFactory();
		}
		return uniqueInstance;
	}

	public void fill() {
		if (empty) {
			empty = false;
			boiled = false;
		}
	}

	public void boil() {
		if (!empty && !boiled) {
			boiled = true;
		}
	}

	public void drain() {
		if (!empty && boiled) {
			empty = false;
			boiled = false;
		}
	}
}
