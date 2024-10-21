package chap_1;

public class Hero implements Cloneable{
	public String name;
	int hp;
	String sword;
	public boolean equals(Object o){
		if (o == this) return true;
		return true;
	}
	
	public Hero clone() {
		Hero result = new Hero();
		result.name = this.name;
		result.hp = this.hp;
		result.sword = this.sword;
		return result;
	}
}
