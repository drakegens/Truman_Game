
/**
 * 
 * @author Seth Martin
 * @version 12/2
 */
public class Quest {

	private static boolean firstLecture = false;
	private static boolean secondLecture = false;
	private static boolean thirdLecture = false;
	private static boolean fourthLecture = false;
	private static boolean amuletOfYendor = false;
	
	public static void main() {
		Player player = new Player();
		Home home = new Home();
		home.start(player);
		
	}
	public void setFirstLecture(){
		firstLecture = true;
	}
	public void setSecondLecture(){
		secondLecture = true;
	
	}
	public void setThirdLecture(){
		thirdLecture = true;
	}
	public void setFourthLecture(){
		fourthLecture = true;
	}
}

