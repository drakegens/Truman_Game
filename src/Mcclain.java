import java.util.Scanner;


public class Mcclain {

	private boolean found = false;
	public Player hall(Player player) {
		System.out.println("You arrive at McClain Hall. \n"
				+ "You notice an area you've never seen before off to your left. \n"
				+ "When you approach it, you find three pictures hanging on a tree. \n"
				+ "You also see a golden potato nearby. \n"
				+ "What do you do?");
		Scanner in = new Scanner(System.in);
		String response;
		boolean inspectedPotato = false;
		boolean nearPictures = false;
		while (!found) {
			System.out.println("You can...");
			if (!nearPictures) {
				System.out.println("Approach pictures.");
			}
			if (nearPictures) {
				System.out.println("Leave pictures.");
				if(inspectedPotato) {
					System.out.println("Put the potato under the picture of McClain. \n"
							+ "Put the potato under the picture of Violet. \n"
							+ "Put the potato under the picture of Centennial.");
				}
				if(!inspectedPotato) {
					System.out.println("Touch the picture of McClain. \n"
							+ "Touch the picture of Violet. \n"
							+ "Touch the picture of Centennial. ");
				}
			}
			if (!inspectedPotato) {
				System.out.println("Approach the potato.");
			}
			
			response = in.nextLine();
			if (!nearPictures && response.equals("Approach pictures.")) {
				nearPictures = true;
				System.out.println("You notice that the three pictures from right to left are: \n"
						+ "McClain Hall, Violet Hall, Centennial Hall.");
			}
			if (nearPictures) {
				if (response.equals("Leave pictures.")) {
					nearPictures = false;
					System.out.println("You leave the pictures alone.");
				}
				if (inspectedPotato) {
					if (response.equals("Put the potato under the picture of McClain.")) {
						System.out.println("The potato shimmers, then disappears. \n"
								+ "Moments later, it reappears near where it first was. \n"
								+ "You get the feeling it didn't belong there.");
						inspectedPotato = false;
					}
					if (response.equals("Put the potato under the picture of Violet.")) {
						found = true;
						System.out.println("The potato shines brightly, then sinks into the ground. \n"
								+ "Moments later, you find yourself staring at an amulet in the hole the potato left. \n"
								+ "It shines brightly as you pick it up. \n"
								+ "You feel as if this amulet would return to this place after using it. \n"
								+ "You suddenly find yourself staring at empty space. You decide to leave.");
					}
					if (response.equals("Put the potato under the picture of Centennial.")) {
						System.out.println("The potato shimmers, then disappears. \n"
								+ "Moments later, it reappears near where it first was. \n"
								+ "You get the feeling it didn't belong there.");
						inspectedPotato = false;						
					}
				}
				if (!inspectedPotato) {
					if (response.equals("Touch the picture of McClain.")) {
						System.out.println("You suddenly feel foolish, as if what you just did was pointless.");
					}
					if (response.equals("Touch the picture of Violet.")) {
						System.out.println("You suddenly feel foolish, as if what you just did was pointless.");						
					}
					if (response.equals("Touch the picture of Centennial.")) {
						System.out.println("You suddenly feel foolish, as if what you just did was pointless.");
					}
				}
			}
			if (!inspectedPotato && response.equals("Approach the potato.")) {
				inspectedPotato = true;
				System.out.println("The potato shines as you approach it. \n"
						+ "You pick up the potato. \n"
						+ "On the potato, you notice some writing which says: \n"
						+ "'Ye who seek the sacred amulet, place me under the building to which I belong.'");
			}
			else {
				System.out.println("Invalid response.");
			}
		}
		Outside encounter = new Outside();
		player = encounter.encounter(player);
		return player;
	}
}
