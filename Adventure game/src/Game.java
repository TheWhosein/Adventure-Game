import java.util.Scanner;

public class Game{
	Player player;
	Location location;
	Scanner input = new Scanner(System.in);
	
	public void login() {
		System.out.println("Welcome to Adventure game");
		System.out.print("Enter your name: ");
		String playerName = input.nextLine();
		player = new Player(playerName);
		player.SelectCha();
		start();
		
	}
	public void start() {
		while(true) {
			System.out.println("---------------------------------");
			System.out.println();
			System.out.println("1. Safehouse -> not have enemy\n2. Cave -> zombies\n3. Forest -> vampire\n4. River -> bears\n5. Market -> buy weapon or armor");
			System.out.print("Select a place: ");
			int selLoc = input.nextInt();
			while(selLoc<0 || selLoc>5) {
				System.out.println("Choose correct number(1-5):");
				selLoc = input.nextInt();
			}
			
			switch(selLoc) {
			case 1:
				location = new Safehouse(player);
				break;
			case 2:
				location = new Cave(player);
				break;
			case 3:
				location = new Forest(player);
				break;
			case 4:
				location = new River(player);
				break;
			case 5:
				location = new ToolStore(player);
				break;
			default:
				location = new Safehouse(player);
				break;
			}
			
			if(location.getClass().getName().equals("Safehouse")) {
				if(player.getInv().isFirewood() && player.getInv().isFood() && player.getInv().isWater()) {
					System.out.println("You win!");
					break;
				}
			}
			
			if(!location.getLocation()) {
				System.out.println("Game over!");
				break;
			}
		}
	}
	
}
