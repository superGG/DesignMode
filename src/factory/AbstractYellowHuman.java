package factory;

public abstract class AbstractYellowHuman implements Human {

	@Override
	public void say() {
		System.out.println("yellow human say nihao");
	}

	@Override
	public void eat() {
		System.out.println("yellow human eat rice");
	}

}
