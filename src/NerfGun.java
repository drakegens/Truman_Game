
public class NerfGun extends Item {

	private int power;
	private int accuracy;
	private String name;
	public NerfGun(String description, String n, int a, int p) {
		super(description);
		name = n;
		accuracy = a;
		power = p;
		// TODO Auto-generated constructor stub
	}

	public int getPower() {
		return power;
	}
	
	public int getAccuracy() {
		return accuracy;
	}
	
	public String getName() {
		return name;
	}
}
