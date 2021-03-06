//Updated
public class Zombie {

	private int turns; // a zombie takes a number of turns to reach you
	private int health;
	private String name;

	public Zombie(String n){
		name = n;
		turns = (int) (5.0 *  Math.random()) + 7;
		health = 100;
	}

	public int getTurns() {
		return turns;
	}
	
	public int getHealth() {
		return health;
	}
	
	public void changeTurns(int changeTurns) {
		turns = turns - changeTurns;
	}
	
	public void changeHealth(int changeHealth) {
		health = health - changeHealth;
	}
}
