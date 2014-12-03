
import java.util.Scanner;

/**
 *  
 * @author Seth Martin
 * @version 12/2
 */
public class Outside extends Room{

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
	}
	
	public void encounter() {
		Zombie zombie = new Zombie("zomb");
		Scanner in = new Scanner(System.in);
		while (zombie.getTurns() >= 0 || zombie.getHealth() > 0) {
			System.out.println("The zombie has " + zombie.getTurns() + "more turns before it reaches you. \n"
					+ "The zombie has " + zombie.getHealth() + "health left. \n"
							+ "You can: \n"
							+ "Shoot the zombie. \n"
							+ "Try to run. \n"
							+ "Change weapons. \n "
							+ "What do you do?");
			String response = in.nextLine();
			if (response == "Shoot the zombie.") {
				
			}
			else if (response == "Try to run.") {
				if (weather == 2) {
					if (20 * (int) Math.random() + 1 >= 18) { //roll a d20, if a 18 or higher is rolled, success
						zombie.changeHealth(0);
					}
					else {
						zombie.changeTurns(zombie.getTurns() - 1);
						System.out.println("You failed to run away.");
					}
				}
				else {
					if (20 * (int) Math.random() + 1 >= 15) { //roll a d20, if a 15 or higher is rolled, success
						
					}
				}
			}
			else if (response == "Change weapons.") {
				
			}
			else {
				System.out.println("Invalid response.");
			}
		}
	}
}
