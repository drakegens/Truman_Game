import java.util.Scanner;


public class CentenialHall {

	public Player room3251(Player player) {
		System.out.println("You arrive at Centennial Hall room 3251. \n"
				+ "At first, you don't see anything. Then, a door appears mysteriously out of nowhere. \n"
				+ "You open the door and go inside. \n"
				+ "Inside, you find that the room is incredibly dusty, as if nobody has been here for decades. \n"
				+ "There is stuff everywhere. \n"
				+ "What do you do?");
		boolean found = false;
		boolean investigatedBed = false;
		boolean investigatedBathroom = false;
		boolean investigatedCloset = false;
		boolean investigatedDesk = false;
		Scanner in = new Scanner(System.in);
		String response;
		while(!found) {
			System.out.println("You decide to...");
			if (!investigatedBed) {
				System.out.println("Investigate the bed.");
			}
			if (!investigatedCloset) {
				System.out.println("Investigate the closet.");
			}
			if (!investigatedBathroom) {
				System.out.println("Investigate the bathroom.");
			}
			if (!investigatedDesk) {
				System.out.println("Investigate the desk.");
			}
			response = in.nextLine();
			if (response.equals("Investigate the bed.") && !investigatedBed) {
				System.out.println("The bed is old. It's barely a thin piece of cloth. Underneath the cloth you find an old, outdated textbook.\n"
						+ "It doesn't provide much knowledge, but there is some trivia scrawled on the cover.");
				Textbook textbook = new Textbook("The Truman School colors are purple and white.", 5);//replace text with trivia
				player.addItem(textbook);
				investigatedBed = true;
			}
			if (response.equals("Investigate the closet") && !investigatedCloset) {
				System.out.println("This closet is old and musty. Within it you find a nerf shotgun. \n"
						+ "How this arrived here, no one will ever know.");
				NerfGun nerfShotGun = new NerfGun("Nerf Shotgun, has 3 accuracy and 50 power", "Nerf Shotgun", 7, 20);
				player.addGun(nerfShotGun);
				investigatedCloset = true;
			}
			if (response.equals("Investigate the bathroom.") && !investigatedBathroom) {
				System.out.println("You open the bathroom door. You find that the bathroom is utterly unremarkable in every way. \n"
						+ "However, when you open the medicine cabinet, you find somebody had stashed some nerf darts there. \n"
						+ "Why anybody would put nerf darts in the medicine cabinet, you can only guess. \n"
						+ "You find 10 darts.");
				player.changeDarts(10);
			}
			if (response.equals("Investigate the desk.") && !investigatedDesk) {
				System.out.println("As you approach the desk, your mind is filled with an image of a potato buried near Violet Hall. \n"
						+ "You get the distinct feeling that the potato is no longer there, but that many saw it as a good luck charm. \n"
						+ "You find a message that says: \n"
						+ "'The mystical amulet is real! All this time, and it was right there under my nose! \n"
						+ "All I need to do is visit McClain on the eve of the third lecture! \n"
						+ "Yendor's splendor will be revealed to me!");
				found = true;
			}
		}
		System.out.println("You blink and find yourself staring at an empty hallway in Centennial Hall. You decide to leave.");
		Outside encounter = new Outside();
		player = encounter.encounter(player);
		return player;
	}
}
