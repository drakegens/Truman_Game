
public class Zombie extends NPC{

	private int turns; // a zombie takes a number of turns to reach you
	private int health;

	public Zombie(String name){
		super(name);
		turns = 5 * (int) Math.random() + 5;
		health = 100;
	}

	public int getTurns() {
		return turns;
	}
	
	public int getHealth() {
		return health;
	}
	
	public void changeTurns(int newTurns) {
		turns = newTurns;
	}
	
	public void changeHealth(int changeHealth) {
		health = health - changeHealth;
	}
}
