
/**
 * 
 * @author Seth Martin
 * @version 12/3
 */
public abstract class Item {

	private String description;
	private boolean isWeapon;
	
	public Item(String description)
		{this.description = description;
	
		}
	
	public String getDesc() {
		return description;
	}
	
	public boolean getIsWeapon() {
		return isWeapon;
	}
	public void changeIsWeapon(boolean bool) {
		isWeapon = bool;
	}
}

