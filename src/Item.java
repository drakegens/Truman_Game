
/**
 * 
 * @author Seth Martin
 * @version 12/3
 */
public abstract class Item {

	private String description;
	
	public Item(String description)
		{this.description = description;
	
		}
	
	public String getDesc() {
		return description;
	}
}

