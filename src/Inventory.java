//Updated
import java.util.ArrayList;


public class Inventory {

	private int nerfDarts = 25;
	private String eqDesc;
	private String eqName;
	private int eqAcc;
	private int eqPow;
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
	
	public int getAcc() {
		return eqAcc;
	}
	
	public int getPow() {
		return eqPow;
	}
	
	public String getName() {
		return eqName;
	}
	
	public String getDesc() {
		return eqDesc;
	}
	
	public void equip(NerfGun n) {
		eqDesc = n.getDesc();
		eqName = n.getName();
		eqAcc = n.getAccuracy();
		eqPow = n.getPower();
	}
}
 
