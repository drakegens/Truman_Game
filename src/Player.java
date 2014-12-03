
import java.util.ArrayList;

/**
 * 
 * @author Seth Martin
 * @version 12/2
 */
public class Player {

	private Inventory inv = new Inventory();
	private int knowledge = 100;
	
	// I don't know if we need this accessor
//	public ArrayList<Item> getInv() {
//		return inv.getInv();
//	}
	
	public void addItem(Item item) {
		inv.addItem(item);
	}
	
	public void removeItem(Item item) {
		inv.remItem(item);
	}
	
	public void addKnowledge(int x) {
		knowledge = knowledge + x;
	}
	
	//Accessors
	public int getKnowledge() {
		return knowledge;
	}
	
	public int getDarts() {
		return inv.getDarts();
	}
	
	public String getDesc() {
		return inv.getDesc();
	}
		
	public String getNerfName() {
		return inv.getName();
	}
	
	public int getPow() {
		return inv.getPow();
	}
	
	public int getAcc() {
		return inv.getAcc();
	}
	
	// Mutators
	public void changeGun(NerfGun n) {
		inv.equip(n);
	}
	
	public void changeDarts(int change) {
		inv.changeDarts(change);
	}
}

