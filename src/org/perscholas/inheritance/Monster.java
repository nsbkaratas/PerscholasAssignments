package org.perscholas.inheritance;

public class Monster {

	public Monster(String string) {
		// TODO Auto-generated constructor stub
	}

	//methods
	public String attack () {
		return "!^_&^$@+%$* I don't know how to attack!";
	}	
	
}
class FireMonster extends Monster {
	public FireMonster(String string) {
		super(string);
	}

	@Override
	public String attack () {
		return "Attack with fire!";
	}
	
}
class WaterMonster extends Monster {
	public WaterMonster(String string) {
		super(string);
	}

	@Override
	public String attack () {
		return "Attack with water!";
	}
}
class StoneMonster extends Monster {
	public StoneMonster(String string) {
		super(string);
	}

	@Override
	public String attack () {
		return "Attack with stones!";
	}
}
