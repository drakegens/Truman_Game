
/**
 * 
 * @author Seth Martin
 * @version 12/2
 */
public class KnowledgeItem extends Item {

	private int knowledge;
	
	public KnowledgeItem(String description, int knowledge) {
		super(description);
		{this.knowledge = knowledge;}
		changeIsWeapon(false); //These items are not weapons.
	}

}
