package factory;

public class test {
	
	
	public static void main(String[] args) {
		MaleHumanFactory maleFactory = new MaleHumanFactory();
		FemaleHumanFactory femaleFactory = new FemaleHumanFactory();
		
		Human yellowMaleHuman = maleFactory.createYellowHuman();
		Human yellowFemaleHuman = femaleFactory.createYellowHuman();
		
		yellowMaleHuman.eat();
		yellowFemaleHuman.say();
	}
}
