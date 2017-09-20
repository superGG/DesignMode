package factory;

public abstract class AbstractWhiteHuman implements Human {

	@Override
	public void say() {
		System.out.println("white human say english more");
	}

	@Override
	public void eat() {
		System.out.println("white human eat steak(牛排)");
	}

}
