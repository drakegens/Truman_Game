
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
	

	
	public void addTextbook(Textbook item) {
		inv.addBook(item);
	}
	public boolean amuletWon(){
		return amulet;
	}
	public void removeTextbook(Textbook item) {
		inv.remBook(item);
	}
	
	public void addFlashdrive(Flashdrive item) {
		inv.addFlash(item);
	}
	
	public void removeFlashdrive(Flashdrive item) {
		inv.remFlash(item);
	}
	
	public void addGun(NerfGun gun) {
		inv.addGun(gun);
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
	public void changeGun(NerfGun n) {
		inv.equip(n);
	}
	
	public void changeDarts(int change) {
		inv.changeDarts(change);
	}
}

