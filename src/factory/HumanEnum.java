package factory;

public enum HumanEnum {
	
	YellowMaleHuman("factory.YellowMaleHuman"),
	YellowFemaleHuman("factory.YellowFemaleHuman"),
	BlackMaleHuman("factory.BlackMaleHuman"),
	BlackFemaleHuman("factory.BlackFemaleHuman"),
	WhiteMaleHuman("factory.WhiteMaleHuman"),
	WhiteFemaleHuman("factory.WhiteFemaleHuman");
	
	
	private String value = "";
	private HumanEnum(String value) {
		this.value = value;
	}
	
	public String getValue(){
		return this.value;
	}

}
