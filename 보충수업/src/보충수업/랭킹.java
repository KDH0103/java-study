package model;

public class Enemy {
	
	private int enemyId;
	private String enemyName;
	private int healthy;
	private int speed;
	private int reward;
	private int damage;
	
	
	   public Enemy() {
	    }
	
	
	public Enemy(int enemyId, String enemyName, int healthy, int speed, int reward, int damage) {
		super();
		this.enemyId = enemyId;
		this.enemyName = enemyName;
		this.healthy = healthy;
		this.speed = speed;
		this.reward = reward;
		this.damage = damage;
	}



	public int getEnemyId() {
		return enemyId;
	}



	public void setEnemyId(int enemyId) {
		this.enemyId = enemyId;
	}



	public String getEnemyName() {
		return enemyName;
	}



	public void setEnemyName(String enemyName) {
		this.enemyName = enemyName;
	}



	public int getHealthy() {
		return healthy;
	}



	public void setHealthy(int healthy) {
		this.healthy = healthy;
	}



	public int getSpeed() {
		return speed;
	}



	public void setSpeed(int speed) {
		this.speed = speed;
	}



	public int getReward() {
		return reward;
	}



	public void setReward(int reward) {
		this.reward = reward;
	}



	public int getDamage() {
		return damage;
	}



	public void setDamage(int damage) {
		this.damage = damage;
	}
	
	


}
