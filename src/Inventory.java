
import java.util.ArrayList;


public class Inventory {

	private int nerfDarts = 25;
	private ArrayList<Item> inv = new ArrayList<Item>();
	
	public ArrayList<Item> getInv() {
		return inv;
	}
	
	public void addItem(Item item) {
		inv.add(item);
	}
	
	public void remItem(Item item) {
		inv.remove(item);
	}
	
	public int getDarts() {
		return nerfDarts;
	}
	
	public void changeDarts(int dx) { //dx as in change in x
		nerfDarts = nerfDarts + dx;
	}
}

