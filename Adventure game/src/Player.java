import java.util.Scanner;

public class Player {
	private int damage, healthy, money, rHealthy;
	private String name, cName;
	private Inventory inv;
	Scanner input = new Scanner(System.in);
	
	public Player(String name) {
		this.name = name;
		this.inv = new Inventory();
	}
	
	public void SelectCha() {
		switch(chaMenu()) {
		//Samuray
		case 1:
			initPlayer("Samuray", 5, 21, 15);
			break;
		//Archer
		case 2:
			initPlayer("Archer", 7, 18, 20);
			break;
		// Cavalry
		case 3:
			initPlayer("Cavalry",8 , 24, 5);
			break;
		default:
			initPlayer("Samuray", 5, 21, 15);
			break;
		}
		System.out.println("Character: "+ getcName()+" ,Damage: "+getDamage()+" ,Health: "+getHealthy()+" ,Money: "+getMoney());
	}
	
	public int chaMenu() {
		System.out.println("1. Samuray\tDamage: 5\tHP: 21\tMoney: 15");
		System.out.println("2. Archer\tDamage: 7\tHP: 18\tMoney: 20");
		System.out.println("3. Cavalry\tDamage: 8\tHP: 24\tMoney: 5");
		System.out.print("Choose a character: ");
		int chaID = input.nextInt();
		while(chaID<1 || chaID>3) {
			System.out.print("Choose correct number(1-3): ");
			chaID = input.nextInt();
		}
		return chaID;
	}
	
	public int getTotalDamage() {
		return this.getDamage() + this.getInv().getDamage();
	}
	
	public void initPlayer(String cName, int dam, int hlthy, int mny) {
		setcName(cName);
		setDamage(dam);
		setHealthy(hlthy);
		setMoney(mny);
		setrHealthy(hlthy);
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	public int getHealthy() {
		return healthy;
	}

	public void setHealthy(int healthy) {
		this.healthy = healthy;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public Inventory getInv() {
		return inv;
	}

	public void setInv(Inventory inv) {
		this.inv = inv;
	}

	public int getrHealthy() {
		return rHealthy;
	}

	public void setrHealthy(int rHealthy) {
		this.rHealthy = rHealthy;
	}
	
}
