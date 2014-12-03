
import java.util.Scanner;

public class Home extends Room {

	public void start() {
		System.out.println("You are at home. There is a computer, a bed, and 3 textbooks. You can: \n"
				+ "Go to Violett Hall. \n"
				+ "Pick up Textbooks. \n"
				+ "You choose to: ");
		Scanner in = new Scanner(System.in);
		String response = in.nextLine();
		boolean valid = false;
		boolean gotten = false;
		while (valid = false){
			if (response == "Go to Violett Hall.") {
				valid = true;
			}
			else if (response == "Pick up Textbooks.") {
				if (gotten == false) {
					gotten = true;
					//finish later
				}
			}
			else {
				System.out.println("Invalid response. You choose to: ");
			}
		}
		Outside encounter = new Outside();
		encounter.encounter();
		VioletHall next = new VioletHall();
		next.firstLecture();
	}
}
