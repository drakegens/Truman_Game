import java.util.Scanner;


public class Home extends Room {

	public void start() {
		System.out.println("You are at home. There is a computer, a bed, and 3 textbooks. You can: \n"
				+ "Go to class. \n"
				+ "Pick up Textbooks. \n"
				+ "You choose to: ");
		Scanner in = new Scanner(System.in);
		String response = in.nextLine();
		boolean valid;
		while (valid = false){
			if (response == "Go to class.") {
				// Do later
			}
			else if (response == "Pick up Textbooks.") {
				//Do later
			}
			else {
				System.out.println("Invalid response. You choose to: ");
			}
		}
			
	}
}
