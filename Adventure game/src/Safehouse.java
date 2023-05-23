
public class Safehouse extends NormalLoc{

	Safehouse(Player player) {
		super(player, "Safehouse");
	}
	
	public boolean getLocation() {
		player.setHealthy(player.getrHealthy());
		System.out.println("Your HP is fulled!");
		System.out.println("You are in the safehouse.");
		return true;
	}

}
