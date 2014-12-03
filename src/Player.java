import java.util.ArrayList;

/**
 * 
 * @author Seth Martin
 * @version 12/2
 */
public class Player {

	private Inventory inv = new Inventory();
	private int knowledge = 100;
	
	public ArrayList<Item> getInv() {
		return inv.getInv();
	}
	
	public void addItem(Item item) {
		inv.addItem(item);
	}
	
	public void removeItem(Item item) {
		inv.remItem(item);
	}
	
	public int getKnowledge() {
		return knowledge;
	}
	
	public void addKnowledge(int x) {
		knowledge = knowledge + x;
	}
}
