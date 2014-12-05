
import java.util.ArrayList;
import java.util.Scanner;

 
public class Home extends Room {

	public Player start(Player player) {
		System.out.println("You are at home. There is a computer, a bed, and 3 textbooks. You can: \n");
		Scanner in = new Scanner(System.in);
		String response;
		boolean valid = false;
		boolean gotten = false;
		while (valid == false){
			System.out.println("Go to Violet Hall.");
			if (!gotten) {
				System.out.println("Pick up textbooks.");
			}
			System.out.println("You choose to...");
			response = in.nextLine();
			if (response.equals("Go to Violet Hall.")) {
				valid = true;
				System.out.println("It's Humans vs. Zombies at Truman right now, so you pick up your nerf pistol and 25 nerf darts on your way out.");
				NerfGun nerfPistol = new NerfGun("Nerf Pistol. It has 17 accuracy, and 30 power.", "Nerf Pistol", 17, 30);
				player.addGun(nerfPistol);
			}
			else if (response.equals("Pick up textbooks.") && !gotten) {
				System.out.println("You pick up your computer science textbook.");
				Textbook textbook = new Textbook("Object Oriented Design", "This textbook teaches you how to program in an object oriented language.", 25);
				player.addTextbook(textbook);
				gotten = true;
			}
			else {
				System.out.println("Invalid response.");
			}
		}
		Outside encounter = new Outside();
		player = encounter.encounter(player);
		return player;
	}
	
	public Player secondDay(Player player) {
		player = night(player);
		System.out.println("You wake up in the morning. \n"
				+ "You discover you have slept in. \n"
				+ "You have class in 30 minutes. \n"
				+ "You rush out the door after grabbing 10 more darts.");
		player.changeDarts(10);
		Outside encounter = new Outside();
		player = encounter.encounter(player);
		return player;
	}
	
	public Player night(Player player) {
		System.out.println("You arrive at your home. You can...");
		Scanner in = new Scanner(System.in);
		String response;
		boolean sleep = false;
		while (!sleep) {
			System.out.println("Go to sleep.");
			System.out.println("Study.");
			
			response = in.nextLine();
			if (response.equals("Study.")) {
				player = study(player);
			}
			if (response.equals("Go to sleep.")) {
				System.out.println("You turn in for the night.");
				sleep = true;
			}
		}
		return player;
	}
	
	private Player study(Player player) {
		ArrayList<Flashdrive> fInv = new ArrayList<Flashdrive>();
		fInv = player.getFlash();
		ArrayList<Textbook> tInv = new ArrayList<Textbook>();
		tInv = player.getBooks();
		boolean studying = true;
		Scanner in = new Scanner(System.in);
		String response;
		while (studying) {
			System.out.println("What do you want to do? You can... \n"
				+ "Read textbook. \n"
				+ "Use flashdrive. \n"
				+ "Stop studying. ");
			response = in.nextLine();
			if (response.equals("Read textbook.")) {
				System.out.println("What textbook do you want to read? Input the number of the book you want to read.");
				int i = 0;
				for (Textbook book : tInv) {
					i++;
					System.out.println(i + ". " + book.getName());
				}
				int num = in.nextInt() - 1;
				System.out.println(tInv.get(num).getDesc());
				System.out.println("You gain " + tInv.get(num).getKnowledge() + " knowledge.");
				player.addKnowledge(tInv.get(num).getKnowledge());
				player.removeTextbook(tInv.get(num));
				tInv.remove(num);
			}
			if (response.equals("Use flashdrive.")) {
				int counter = 0;
				int knowledge = 0;
				for (Flashdrive flash : fInv) {
					counter++;
					knowledge = flash.getKnowledge() + knowledge;
					player.removeFlashdrive(flash);
				}
				System.out.println("You used " + counter + " flashdrives and gained " + knowledge + " knowledge.");
				player.addKnowledge(knowledge);
			}
			if (response.equals("Stop studying.")) {
				studying = false;
			}
		}
		
		
		return player;
	}
}
