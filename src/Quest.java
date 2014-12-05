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
	private static boolean day2 = true;
	private static boolean day3 = true;
	private static boolean day4 = true;
	private static boolean visitedCH3251 = false;
	private static boolean visitedMcClain = false;
	
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
				player = home.secondDay(player);
				day1 = false;
			}
		}
		player = vh.secondLecture(player);
		Mcclain mch = new Mcclain();
		while (day2) {
			System.out.println("Where do you want to go? You can go to... ");
			if (ch.getFound() && !visitedMcClain) {
				System.out.println("McClain Hall");
			}
			System.out.println("Home");
			
			response = in.nextLine();
			if (response.equals("McClain Hall") && !visitedMcClain && ch.getFound()) {
				player = mch.hall(player);
				visitedMcClain = true;
			}
			if (response.equals("Home")) {
				player = home.thirdDay(player);
				day2 = false;
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

