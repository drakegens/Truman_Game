import java.util.Scanner;


public class VioletHall {

	public Player firstLecture(Player player) {
		System.out.println("Player enters VH 1216, Dr. Neitzke’s class. \n"
				+ "It is 10 minutes before class. 4 students are sleeping, \n"
				+ "backpacks are slumped against a wall. There is a bulletin board, \n"
				+ "numerous desks and a laptop. \n"
				+ "You only have time to do 2 things before Dr. Neitzke begins class. \n"
				+ "Of course leaving the room doesn’t count. You decide to… \n"
				+ "Leave the room \n"
				+ "Investigate the Laptop \n"
				+ "Investigate Backpacks \n"
				+ "Investigate Students \n"
				+ "Investigate Bulletin Board \n"
				+ "Take a seat before class \n");
		Scanner in = new Scanner(System.in);
		String response;
		boolean valid = false;
		
		while (!valid){
			response = in.nextLine();
			if (response.equals("Leave the room")){
				valid = true;
				//leave the room
			}
			if (response.equals("Investigate the Laptop")){
				valid = true;//investigate laptop
				
			}
			if (response.equals("Investigate Backpacks")){
				valid = true;//investigate backpack
			}
			if (response.equals("Investigate Students")){
				System.out.println("All 4 students are in a deep slumber. \n"
						+ "On their desks is a sheet of paper with writing, \n"
						+ "that the students seem to have been diligently working on. \n"
						+ "You decide to... \n"
						+ "Investigate sheet of paper \n"
						+ "Wake up a student and converse \n"
						+ "Leave the room \n" 
						+ "Investigate the Laptop \n "
						+ "Investigate Backpacks \n " 
						+ "Investigate Bulletin Board \n" 
						+ "Take a seat before class");
			boolean v = false;
			while(!v){
				response = in.nextLine();
				if (response.equals("Investigate sheet of paper")){
					
				}
				if (response.equals("Wake up a student and converse")){
					
				}
				if (response.equals("Leave the room")){
					leaveRoom();
				}
				if (response.equals("Investigate the Laptop")){
					
				}
				if (response.equals("Investigate Backpacks")){
					
				} 
				if (response.equals("Investigate Bulletin Board")){
					
				}
				else {invalidResponse();
				}
				valid = true;//investigate students
				
				}
			if (response.equals("Investigate Bulletin Board")){
				valid = true;//investigate bulletin board
			}
			if (response.equals("Take a seat before class")){
				valid = true;//take a seat
				
			}
			else {invalidResponse();}
			}
		}
		return player;
	}
	public void invalidResponse(){
		System.out.println("Invalid Response");
	}
	public void leaveRoom(){
		//handle common situation between responses
	}
	public void secondLecture() {
		
	}
	
	public void thirdLecture() {
		
	}
	
	public void fourthLecture() {
		
	}
}

