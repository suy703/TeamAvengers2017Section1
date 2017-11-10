public class Monsters extends Character{
	
	String monsterID;
	String monsterName;
	String monsterDescription;
	String monsterRoomLocation;
	String itemDropped;
	int monsterProbability;
	int monsterHealth;
	int monsterAttackPower;
	
	
	public Monsters(String monsterID, String monsterName, String monsterDescription, String monsterRoomLocation,
			String itemDropped, int monsterProbability, int monsterHealth, int monsterAttackPower, int gold) {
		super(monsterName,monsterHealth,monsterAttackPower,gold);
		this.monsterID = monsterID;
		this.monsterDescription = monsterDescription;
		this.monsterRoomLocation = monsterRoomLocation;
		this.itemDropped = itemDropped;
		this.monsterProbability = monsterProbability;
	}

	public String getMonsterID() {
		return monsterID;
	}

	public void setMonsterID(String monsterID) {
		this.monsterID = monsterID;
	}

	public String getMonsterName() {
		return monsterName;
	}
	public void setMonsterName(String monsterName) {
		this.monsterName = monsterName;
	}
	public String getMonsterDescription() {
		return monsterDescription;
	}
	public void setMonsterDescription(String monsterDescription) {
		this.monsterDescription = monsterDescription;
	}
	public String getMonsterRoomLocation() {
		return monsterRoomLocation;
	}
	public void setMonsterRoomLocation(String monsterRoomLocation) {
		this.monsterRoomLocation = monsterRoomLocation;
	}
	public String getItemDropped() {
		return itemDropped;
	}
	public void setItemDropped(String itemDropped) {
		this.itemDropped = itemDropped;
	}
	public int getMonsterProbability() {
		return monsterProbability;
	}
	public void setMonsterProbability(int monsterProbability) {
		this.monsterProbability = monsterProbability;
	}
	public int getMonsterHealth() {
		return monsterHealth;
	}
	public void setMonsterHealth(int monsterHealth) {
		this.monsterHealth = monsterHealth;
	}
	public int getMonsterAttackPower() {
		return monsterAttackPower;
	}
	public void setMonsterAttackPower(int monsterAttackPower) {
		this.monsterAttackPower = monsterAttackPower;
	}
	
	
	
	

}