import java.util.ArrayList;

/**
 * 
 * @author Seth Martin
 * @version 12/2
 */
public class Player {

	private Inventory inv = new Inventory();
	
	public ArrayList<Item> getInv() {
		return inv.getInv();
	}
	
	public void addItem(Item item) {
		inv.addItem(item);
	}
	
	public void removeItem(Item item) {
		inv.remItem(item);
	}
}
