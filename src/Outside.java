import java.util.ArrayList;
import java.util.Scanner;

/**
 *  
 * @author Seth Martin
 * @version 12/2
 */
public class Outside extends Room{

	private int accuracy;
	private int power;

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
		weather = (int) (4.0 * Math.random());
		if (weather == 4) {weather = 3;} // in the very rare event that weather is 4, change it to 3.
	}
	
	public Player encounter(Player player) {
		Zombie zombie = new Zombie("zomb");

		Scanner in = new Scanner(System.in);
		if (weather == 0) {
			System.out.println("It's sunny outside. You suffer a -2 accuracy penalty");
		}
		if (weather == 1) {
			System.out.println("It's cloudy outside. There is no effect.");
		}
		if (weather == 2) {
			System.out.println("It is raining outside. The zombie takes 3 more turns to reach you.");
			zombie.changeTurns(-3);
		}
		if (weather == 3) {
			System.out.println("It is windy. You suffer a -5 power penalty.");
		}

		updateStats(player);
		while (zombie.getTurns() >= 0 && zombie.getHealth() > 0 && !running) {
			System.out.println("The zombie has " + zombie.getTurns() + "more turns before it reaches you. \n"
					+ "The zombie has " + zombie.getHealth() + "health left. \n"
							+ "You can: \n"
							+ "Shoot the zombie. \n"
							+ "Try to run. \n"
							+ "Change weapons. \n "
							+ "What do you do?");
			zombie.changeTurns(1); //subtract 1 from the current number of turns the zombie has left. 
			String response = in.nextLine();
			if (response.equals("Shoot the zombie.")) {
				if (player.getDarts() > 0) { //player has darts

					player.changeDarts(-1); //You've shot a nerf gun, so you lost a nerf dart
					if ((int) (20.0 * Math.random()) + 1 >= 20 - accuracy) { //roll a d20, if the roll is greater than or equal to 20 - accuracy, success

						System.out.println("You hit the zombie for " + power + "damage."); //Hit for the power of the nerf gun
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
			else if (response.equals("Try to run.")) {
				if (weather == 2) {
					if ((int)(20.0 *  Math.random()) + 1 >= 18) { //roll a d20, if a 18 or higher is rolled, success
						running = true;
					}
					else {
						zombie.changeTurns(zombie.getTurns() - 1);
						System.out.println("You failed to run away.");
					}
				}
				else {
					if ((int) (20.0 * Math.random()) + 1 >= 15) { //roll a d20, if a 15 or higher is rolled, success
						running = true;
					}
				}
			}

			else if (response.equals("Change weapons.")) {
				System.out.println("What weapon do you want to use? Please input the number of the weapon you want to use.");
				ArrayList<NerfGun> weapons = new ArrayList<NerfGun>();
				weapons = player.getGuns();
				int i = 0;
				for (NerfGun weapon : weapons) {
					i++;
					System.out.println(i + ". " + weapon.getDesc());
				}
				int num = in.nextInt() - 1;
				NerfGun gun = weapons.get(num);
				player.changeGun(gun);
				updateStats(player);
			}
			else {
				System.out.println("Invalid response.");
			}
			if (zombie.getHealth() <= 0) {
				System.out.println("The zombie has 'died.'");
				player = loot(player);
			}
			if (zombie.getTurns() == 0 && zombie.getHealth() > 0) {
				ArrayList<Item> items = new ArrayList<Item>();
				items = player.getInv();
				int i = items.size() * (int) Math.random();
				if (i == items.size()) {
					i = i - 1;
				}
				player.removeItem(items.get(i));
			}
		}
		return player;
	}
	
	private void updateStats(Player player) {
		accuracy = player.getAcc();
		power = player.getPow();
		if (weather == 0) {
			accuracy = accuracy - 2;
		}
		if (weather == 3) {
			power = power - 5;
		}
	}
	
	private Player loot(Player player) {
		if ((int) (10.0 * Math.random()) >= 7) {
			System.out.println("The zombie dropped a flash drive as he ran.");
			Flashdrive flashdrive = new Flashdrive("A zombie dropped this flash drive.", 20);
			player.addItem(flashdrive);
		}
		else if ((int) (10.0 * Math.random()) >= 5) {
			System.out.println("The zombie dropped a textbook as he ran.");
			Textbook textbook = new Textbook("A zombie dropped this textbook.", 10);
			player.addItem(textbook);
		}
		int droppedDarts = (int) (10.0 * Math.random()) + 2;
		System.out.println("The zombie has dropped " + droppedDarts + "darts.");
		player.changeDarts(droppedDarts);	
		return player;	
	}
}

