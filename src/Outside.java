
import java.util.ArrayList;
import java.util.Scanner;

/**
 *  
 * @author Seth Martin
 * @version 12/2
 */
public class Outside extends Room{

	private boolean running = false;
	private int weather;
	/**
	 * weather has 4 states
	 * 0 is sunny
	 * 1 is cloudy
	 * 2 is raining
	 * 3 is windy
	 */
	public Outside() {
		weather = 4 *(int) Math.random();
		if (weather == 4) {weather = 3;} // in the very rare event that weather is 4, change it to 3.
	}
	
	public void encounter(Player player) {
		Zombie zombie = new Zombie("zomb");
		Scanner in = new Scanner(System.in);
		while (zombie.getTurns() >= 0 || zombie.getHealth() > 0 || running) {
			System.out.println("The zombie has " + zombie.getTurns() + "more turns before it reaches you. \n"
					+ "The zombie has " + zombie.getHealth() + "health left. \n"
							+ "You can: \n"
							+ "Shoot the zombie. \n"
							+ "Try to run. \n"
							+ "Change weapons. \n "
							+ "What do you do?");
			zombie.changeTurns(1); //subtract 1 from the current number of turns the zombie has left. 
			String response = in.nextLine();
			if (response == "Shoot the zombie.") {
				if (player.getDarts() > 0) { //player has darts
					player.changeDarts(-1); //You've shot a nerf gun, so you lost a nerf dart
					if (20 * Math.random() + 1 >= 20 - player.getAcc()) { //roll a d20, if the roll is greater than or equal to 20 - accuracy, success
						System.out.println("You hit the zombie for " + player.getPow() + "damage."); //Hit for the power of the nerf gun
						zombie.changeHealth(player.getPow()); //Zombie loses health equal to the power of the weapon.
					}
					else { //rolled lower than 20 - accuracy
						System.out.println("You missed.");
					}
				}
				else { //player has no darts
					System.out.println("You have no darts left.");
					zombie.changeTurns(-1); //add 1 to the zombie's turns because you didn't actually shoot.
				}
			}
			else if (response == "Try to run.") {
				if (weather == 2) {
					if (20 * (int) Math.random() + 1 >= 18) { //roll a d20, if a 18 or higher is rolled, success
						running = true;
					}
					else {
						zombie.changeTurns(zombie.getTurns() - 1);
						System.out.println("You failed to run away.");
					}
				}
				else {
					if (20 * (int) Math.random() + 1 >= 15) { //roll a d20, if a 15 or higher is rolled, success
						running = true;
					}
				}
			}
			else if (response == "Change weapons.") {
				
			}
			else {
				System.out.println("Invalid response.");
			}
			if (zombie.getHealth() <= 0) {
				System.out.println("The zombie has 'died.'");
				player = loot(player);
			}
		}
	}
	
	private Player loot(Player player) {
		if (10 * Math.random() >= 7) {
			System.out.println("The zombie dropped a flash drive as he ran.");
			Flashdrive flashdrive = new Flashdrive("A zombie dropped this flash drive.", 20);
			player.addItem(flashdrive);
		}
		else if (10 * Math.random() >= 5) {
			System.out.println("The zombie dropped a textbook as he ran.");
			Textbook textbook = new Textbook("A zombie dropped this textbook.", 10);
			player.addItem(textbook);
		}
		int droppedDarts = 10 * (int) Math.random() + 2;
		System.out.println("The zombie has dropped " + droppedDarts + "darts.");
		player.changeDarts(droppedDarts);	
		return player;	
	}
}
