//Updated
import java.util.ArrayList;


public class Inventory {

	private int nerfDarts = 25;
	private String eqDesc;
	private String eqName;
	private int eqAcc;
	private int eqPow;
	private ArrayList<Textbook> textInv = new ArrayList<Textbook>();
	private ArrayList<Flashdrive> flashInv = new ArrayList<Flashdrive>();
	private ArrayList<NerfGun> gunInv = new ArrayList<NerfGun>();
	
	public ArrayList<Flashdrive> getFlash() {
		return flashInv;
	}
	
	public ArrayList<Textbook> getBooks() {
		return textInv;
	}
	
	public void addBook(Textbook book) {
		textInv.add(book);
	}
	
	public void remBook(Textbook book) {
		textInv.remove(book);
	}
	
	public void addFlash(Flashdrive flash) {
		flashInv.add(flash);
	}
	
	public void remFlash(Flashdrive flash) {
		flashInv.remove(flash);
	}
	
	public void addGun(NerfGun gun) {
		gunInv.add(gun);
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
	
	public ArrayList<NerfGun> getNerfGuns() {
		return gunInv;
	}
}
 
