
public class Zombie extends NPC{

	private int turns; // a zombie takes a number of turns to reach you

	public Zombie(String name){
		super(name);
		turns = 5 * (int) Math.random() + 5;
	}


}
