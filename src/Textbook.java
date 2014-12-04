
/**
 * 
 * @author Seth Martin
 * @version 12/2
 */
public class Textbook extends KnowledgeItem {

	String name;
	public Textbook(String n, String description, int knowledge) {
		super(description, knowledge);
		name = n;
	}
	
	public String getName() {
		return name;
	}
}

