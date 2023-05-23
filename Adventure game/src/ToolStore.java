
public class ToolStore extends NormalLoc{
	ToolStore(Player player) {
		super(player, "Tool Store");
	}
	
	public boolean getLocation() {
		System.out.println("Money: "+ player.getMoney());
		System.out.println("1. Weapons\n2. Armors\n3. Exit");
		System.out.print("Enter:");
		int selTool = scan.nextInt();
		int selItemID;
		switch(selTool) {
		case 1:
			selItemID = weaponMenu();
			buyWeapon(selItemID);
			
			break;
		case 2:
			selItemID = armorMenu();
			buyArmor(selItemID);
			break;
		default:
			break;
		}
		return true;
	}
	
	public int armorMenu() {
		System.out.println("1. Light\t<Price: 25 - Damage: 2>");
		System.out.println("2. Medium\t<Price: 35 - Damage: 3>");
		System.out.println("3. Heavy\t<Price: 45 - Damage: 7>");
		System.out.println("4. Exit");
		System.out.print("Select choice: ");
		int selArmorID = scan.nextInt();
		return selArmorID;
	}
	
	public void buyArmor(int itemID) {
		int avoid =0, price = 0;
		String aName = null;
		switch(itemID) {
		case 1:
			avoid = 1;
			aName = "Light";
			price = 15;
			break;
		case 2:
			avoid = 3;
			aName = "Medium";
			price = 35;
			break;
		case 3:
			avoid = 5;
			aName = "Heavy";
			price = 40;
			break;
		case 4:
			System.out.println("Exiting...");
			break;
		default:
			System.out.println("Not correct!");
			break;
		}
		if(price > 0) {
			if(player.getMoney() >= price) {
				player.getInv().setArmor(avoid);
				player.getInv().setaName(aName);
				player.setMoney(player.getMoney() - price);
				System.out.println("You buy a " + aName + ". New armor: " + player.getInv().getArmor());
				System.out.println("Money: "+player.getMoney());
			}
			else {
				System.out.println("You don't have enough money!");
			}
		}
	}
	
	public int weaponMenu() {
		System.out.println("1. Pistol\t<Price: 25 - Damage: 2>");
		System.out.println("2. Sword\t<Price: 35 - Damage: 3>");
		System.out.println("3. Riffle\t<Price: 45 - Damage: 7>");
		System.out.println("4. Exit");
		System.out.print("Select choice: ");
		int selWeaponID = scan.nextInt();
		return selWeaponID;
	}
	
	public void buyWeapon(int itemID) {
		int damage =0, price = 0;
		String wName = null;
		switch(itemID) {
		case 1:
			damage = 2;
			wName = "Pistol";
			price = 25;
			break;
		case 2:
			damage = 3;
			wName = "Sword";
			price = 35;
			break;
		case 3:
			damage = 7;
			wName = "Riffle";
			price = 45;
			break;
		case 4:
			System.out.println("Exiting...");
			break;
		default:
			System.out.println("Not correct!");
			break;
		}
		if(price > 0) {
			if(player.getMoney() >= price) {
				player.getInv().setDamage(damage);
				player.getInv().setwName(wName);
				player.setMoney(player.getMoney() - price);
				System.out.println("You buy a "+wName +". Before damage:"+player.getDamage()+". New damage: "+ player.getTotalDamage());
				System.out.println("Money: "+player.getMoney());
			}
			else {
				System.out.println("You don't have enough money!");
			}
		}
	}
}
