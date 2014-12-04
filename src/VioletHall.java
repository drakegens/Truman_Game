import java.util.Scanner;


public class VioletHall {

	private boolean sidequestStart = false; 
	
	public Player firstLecture(Player player) {
		
		boolean investigatedLaptop = false;
		boolean investigatedBackpack = false;
		boolean investigatedStudents = false;
		boolean investigatedBulletinBoard = false;
		boolean investigatedPaper = false;
		boolean wokenStudent = false;
		boolean answer = false;
		System.out.println("Player enters VH 1216, Dr. Neitzke’s class. \n"
				+ "It is 10 minutes before class. 4 students are sleeping, \n"
				+ "backpacks are slumped against a wall. There is a bulletin board, \n"
				+ "numerous desks and a laptop. \n"
				+ "You only have time to do 3 things before Dr. Neitzke begins class. \n");
		Scanner in = new Scanner(System.in);
		String response;
		int c = 0;
		
		while (c < 2) {
			
			//print out the choices
			System.out.println("You decide to...");
			if (!investigatedLaptop){
				System.out.println("Investigate the laptop.");
			}
			if (!investigatedBackpack) {
				System.out.println("Investigate the backpack.");
			}
			if (!investigatedStudents) {
				System.out.println("Investigate the students.");
			}
			if ((!investigatedPaper) && (investigatedStudents)) {
				System.out.println("Investigate the sheet of paper.");
			}
			if (investigatedStudents && !wokenStudent) {
				System.out.println("Wake up a student and converse.");
			}
			if (!investigatedBulletinBoard){
				System.out.println("Investigate the bulletin board.");
			}
			System.out.println("Take a seat before class.");
			
			//possible outcomes
			response = in.nextLine();
			if (response.equals("Investigate the laptop.") && !investigatedLaptop){
				c++;
				laptopTrivia();	
			}
			if (response.equals("Investigate backpacks.") && !investigatedBackpack){
				c++;
				player = investigateBackpacks(player);
			}
			if (response.equals("Investigate students.") && !investigatedStudents){
				System.out.println("All 4 students are in a deep slumber. \n"
						+ "On their desks is a sheet of paper with writing, \n"
						+ "that the students seem to have been diligently working on. \n");
			}
			if (investigatedStudents && !investigatedPaper){
				if (response.equals("Investigate sheet of paper.") && !investigatedPaper){
					c++;
					System.out.println("The sheet of paper is incomprehensible. \n"
							+ "It is full of scribbles and nonsense. \n"
							+ "Suddenly, you get the feeling that it might be a cipher. \n"
							+ "You see in the corner a question: ");
					MultipleChoice cipher = new MultipleChoice("The name became Truman State University in: ", "1996", "1867", "1870", "2005", 'a'); //finish later
				cipher.askQuestion();
				sidequestStart = cipher.answerQuestion(in.next().charAt(0));}
				
				if (response.equals("Wake up a student and converse.")){
					c++;
					player.addKnowledge(20);
					System.out.println("You converse with the student and learn a bit about Truman's history."); //Add in some trivia here
				}
			}
			if (response.equals("Investigate bulletin board.") && !investigatedBulletinBoard){
				c++;
				System.out.println("Apparently, it's Humans vs. Zombies at Truman.... \n"
						+ "The board also says something about a potato.");
			}
			if (response.equals("Take a seat before class.")){
				c = 3;
			}
			else {invalidResponse();}
		}
		Outside encounter = new Outside();
		player = encounter.encounter(player);
		return player;
	}
	
	public Player investigateBackpacks(Player player){
		System.out.println("You find a textbook on computer science. You take the textbook.");
		Textbook textbook = new Textbook("Big Java", 35);
		player.addItem(textbook);
		return player;
	}
	
	public void laptopTrivia() {
		System.out.println("You find the laptop is open to a page about Truman. \n"
				+ "You gain no knowledge from this, but you do learn some trivia: \n"
				+ "MO Hall is designed similarly to a prison."); //Add in trivia
	}
	
	public boolean getSideQuestStart() {
		return sidequestStart;
	}

	public void secondLecture() {
		
	}
	
	public void thirdLecture() {
		
	}
	
	public void fourthLecture() {
		
	}
	
	public void invalidResponse(){
		System.out.println("Invalid Response");
	}
	
}

