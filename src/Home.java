
import java.util.Scanner;


public class Home extends Room {

	public void start() {
		System.out.println("You are at home. There is a computer, a bed, and 3 textbooks. You can: \n"
				+ "Go to Violet Hall. \n"
				+ "Pick up Textbooks. \n"
				+ "You choose to: ");
		Scanner in = new Scanner(System.in);
		boolean valid = false;
		boolean gotten = false;
		while (valid = false){
			String response = in.nextLine();
			if (response == "Go to Violet Hall.") {
				valid = true;
			}
			else if (response == "Pick up Textbooks.") {
				if (gotten == false) {
					gotten = true;
					//finish later
				}
				else {
					System.out.println("You have already gotten the Textbooks. You choose to: ");
				}
			}
			else {
				System.out.println("Invalid response.");
			}
			if (valid == false) {
				System.out.println("You can: ");
				System.out.println("Go to Violet Hall.");
				if (gotten == false) {
					System.out.println("Pick up Textbooks.");
				}
				System.out.println("You choose to: ");
			}
		}
		Outside encounter = new Outside();
		encounter.encounter();
		VioletHall next = new VioletHall();
		next.firstLecture();
	}
}
