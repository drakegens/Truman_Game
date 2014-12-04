import java.util.Scanner;


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
	private static boolean day1 = true;
	private static boolean visitedCH3251 = false;
	
	public static void main(String[] args) {
		Player player = new Player();
		Home home = new Home();
		player = home.start(player);
		VioletHall vh = new VioletHall();
		player = vh.firstLecture(player);
		firstLecture = true;
		String response;
		Scanner in = new Scanner(System.in);
		CentenialHall ch = new CentenialHall();
		while (day1) {
			System.out.println("Where do you want to go? You can go to... ");
			if (vh.getSideQuestStart() & !visitedCH3251) {
				System.out.println("Centennial Hall room 3251");
			}
			System.out.println("Home");
			
			response = in.nextLine();
			if (response.equals("Centennial Hall room 3251") && vh.getSideQuestStart() && !visitedCH3251) {
				visitedCH3251 = true;
				ch.room3251(player);
			}
			if (response.equals("Home")) {
				player = home.firstNight(player);
			}
		}
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

