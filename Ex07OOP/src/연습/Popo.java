package 연습;

public class Popo {
	
	private String name;
	private String type;
	private String skill;
	private int hp;
	private int atk;
	
	
	
	public Popo(String name, String type, String skill, int hp, int atk) {
		super();
		this.name = name;
		this.type = type;
		this.skill = skill;
		this.hp = hp;
		this.atk = atk;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getAtk() {
		return atk;
	}
	public void setAtk(int atk) {
		this.atk = atk;
	}
	public String getName() {
		return name;
	}
	public String getType() {
		return type;
	}
	public String getSkill() {
		return skill;
	}
}
