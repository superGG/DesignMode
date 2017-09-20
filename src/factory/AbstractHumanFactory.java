package factory;

public abstract class AbstractHumanFactory implements HumanFactory {
	
	Human human;
	
	public Human createHuman(HumanEnum humanenum){
		if(humanenum.getValue() != "") {
			try {
				human = (Human) Class.forName(humanenum.getValue()).newInstance();
			} catch (InstantiationException | IllegalAccessException
					| ClassNotFoundException e) {
				e.printStackTrace();
			}
		}
		return human;
	}

}
