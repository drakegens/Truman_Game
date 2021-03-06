
import java.util.ArrayList;

/**
 * 
 * @author Seth Martin
 * @version 12/2
 */
public class Player {
    private boolean amulet = false;
	private Inventory inv = new Inventory();
	private int knowledge = 100;
	

	
	//Accessors
	public boolean amuletWon(){
		return amulet;
	}
	
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
	
	public ArrayList<NerfGun> getGuns () {
		return inv.getNerfGuns();
	}
	
	public ArrayList<Flashdrive> getFlash() {
		return inv.getFlash();
	}
	
	public ArrayList<Textbook> getBooks() {
		return inv.getBooks();
	}
	
	// Mutators
		public void addTextbook(Textbook item) {
		inv.addBook(item);
	}

	public void removeTextbook(int num) {
		inv.remBook(num);
	}
	
	public void addFlashdrive(Flashdrive item) {
		inv.addFlash(item);
	}
	
	public void removeFlashdrive(int num) {
		inv.remFlash(num);
	}
	
	public void addGun(NerfGun gun) {
		inv.addGun(gun);
	}
	
	public void addKnowledge(int x) {
		knowledge = knowledge + x;
	}
	
	public void foundAmulet() {
		amulet = true;
	}
	
	public void changeGun(NerfGun n) {
		inv.equip(n);
	}
	
	public void changeDarts(int change) {
		inv.changeDarts(change);
	}
}

