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
		//boolean answer = false;
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
				investigatedLaptop = true;
				c++;
				
				laptopTrivia();	
			}
			if (response.equals("Investigate the backpack.") && !investigatedBackpack){
			investigatedBackpack = true;
				c++;
				player = investigateBackpacks(player);
			}
			if (response.equals("Investigate the students.") && !investigatedStudents){
				investigatedStudents = true;
				System.out.println("All 4 students are in a deep slumber. \n"
						+ "On their desks is a sheet of paper with writing, \n"
						+ "that the students seem to have been diligently working on. \n");
			}
			if (investigatedStudents && !investigatedPaper){
				investigatedPaper = true;
				if (response.equals("Investigate the sheet of paper.") && !investigatedPaper){
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
					System.out.println("You converse with the student and learn a bit about Truman's history. /n"
							+ "Apparently Truman is famous for the squirrels around campus."); 
				}
			}
			if (response.equals("Investigate bulletin board.") && !investigatedBulletinBoard){
				
				c++;
				System.out.println("Apparently, it's Humans vs. Zombies at Truman.... \n"
						+ "The board also says something about a potato.");
			}
			if (response.equals("Take a seat before class.")){
				c = 3;
				System.out.println("Class begins.");
			}
			else {invalidResponse();}
		}
		in.close();
		Outside encounter = new Outside();
		player = encounter.encounter(player);
		return player;
	}
	
	public Player investigateBackpacks(Player player){
		System.out.println("You find a textbook on computer science. You take the textbook.");
		Textbook textbook = new Textbook("Big Java","A textbook about java programming concepts",35);
		player.addTextbook(textbook);
		return player;
	}
	
	public void laptopTrivia() {
		System.out.println("You find the laptop is open to a page about Truman. \n"
				+ "You gain no knowledge from this, but you do learn some trivia: \n"
				+ "MO Hall is designed similarly to a prison."); 
	}
	
	public boolean getSideQuestStart() {
		return sidequestStart;
	}

	public Player secondLecture(Player player) {
		boolean investigateStudents = false;
		boolean investigateBulletinBoard = false;
		System.out.println("Player enters another lecture by Dr. Neitzke in VH 1328 \n"
				+ "You are running late. You only have time to do one thing.\n");
		
		String response;
		Scanner in = new Scanner(System.in);
         int t = 0;
       while (t < 1){
    	   System.out.println("You decide to...");
    	   if (!investigateStudents){
    		   System.out.println("Investigate the students.");
    	   }
    	   if (!investigateBulletinBoard){
    		   System.out.println("Investigate the bulletin board.");
    	   }
    	   System.out.println("Take a seat before class.");
    	   response = in.nextLine();
    	   if (response.equals("Investigate the students.") && !investigateStudents){
    		   investigateStudents = true;
    		   System.out.println("Two students seem to be working on the final review together /n"
    				   +"You learn by eavesdropping that there are four questions on the final. /n"
    				   + "Seems like a pretty easy final.");
    		   player.addKnowledge(20);
    		   t++;
    		   
    	   }
    	   if (response.equals("Investigate the bulletin board.") && !investigateBulletinBoard){
    		   investigateBulletinBoard = true;
    		   System.out.println("The bulletin board contains lot of useful information. /n"
    				   + "It states that the president of the University's name is Dr. Troy Paino, /n"
    				   + "not Dr. Leroy Piano, as many seem to believe.");
    		   player.addKnowledge(20);
    		   t++;
    	   }
    	   if (response.equals("Take a seat before class.")){
    		   t++;
    		   System.out.println("Class begins");
    	   }
    	   else {invalidResponse();}
    	   
       }
       in.close();
       Outside encounter = new Outside();
       player = encounter.encounter(player);
       return player;
	}
	
	public Player thirdLecture(Player player) {
		boolean worksheet = false;
		boolean studentConv = false;
		boolean flash = false;
System.out.println("Player enters another class taught by Dr. Neitzke, /n" +
	"It seems like he teaches every class the player has. /n"
		+ "You have time to do two things before class.");
String response;
Scanner in = new Scanner(System.in);
int t = 0;
while (t < 2){
	System.out.println("You decide to...");
if (!worksheet){
	System.out.println("Investigate the worksheet");
}
if (!studentConv){
	System.out.println("Talk to a student");
}
if (!flash){
	System.out.println("Pick up flashdrive.");
}
System.out.println("Take a seat before class.");
response = in.nextLine();

if (response.equals("Investigate the worksheet") && !worksheet){
	worksheet = true;
	System.out.println("The player reads a question off of the worksheet.");
	MultipleChoice q = new MultipleChoice("How many residence halls are on the Truman campus?","6","7","3","99", 'b');
	q.askQuestion();
	boolean answer = q.answerQuestion(in.next().charAt(0));
	if (answer){player.addKnowledge(20);}
	t++;
}
if (response.equals("Talk to a student") && !studentConv){
	studentConv = true;
	System.out.println("The player converses with a student and he tells you /n"
			+ "that the first name of Truman State University was /n"
			+ "North Missouri Normal School");
	player.addKnowledge(20);
	t++;
}
if (response.equals("Pick up flashdrive") && !flash){
	flash = true;
	Flashdrive flashdrive = new Flashdrive("flashdrive", 20);
	player.addFlashdrive(flashdrive);
	System.out.println("You picked up a flashdrive filled with... something.");
}
if (response.equals("Take a seat before class")){
	t = 2;
	System.out.println("Class begins");
}
else {invalidResponse();}


}
in.close();
Outside encounter = new Outside();
player = encounter.encounter(player);
return player;
	}
	
	public Player fourthLecture(Player player) {
		System.out.println("Not surprisingly, you enter a class taught by none other than Dr. Neitzke. /n"
				+ "Dr. Neitzke wants to speak with you before class.");
		
		Scanner in = new Scanner(System.in);
		String response;
		boolean valid = false;
		while (!valid){
		System.out.println("You decide to...");
		
	System.out.println("Speak to Dr. Neitzke.");
	
	
	System.out.println("Take a seat and ignore.");
	response = in.nextLine();
	if (response.equals("Speak to Dr. Neitzke.")){
		System.out.println("Dr. Neitzke informs you that have recieved extra credit /n"
				+ "for being so diligent by always showing up for class. /n"
				+ "Extra credit is received and Dr. Neitzke informs you that /n"
				+ "if you want to marry your significant other, you should kiss them /n"
				+ "in the Sunken Garden. Class begins.");
		player.addKnowledge(20); valid = true;
	}
	if (response.equals("Take a seat and ignore.")){
		System.out.println("You sit down and class begins. It feels like Dr. Neitzke wanted to give you something.");
		valid = true;
	}
	else {invalidResponse();}
	}
		in.close();
		Outside encounter = new Outside();
		player = encounter.encounter(player);
		return player;
	}
	
	public void finalExam(Player player){
		int score = 0;
		System.out.println("You enter the final examination room in Violette Hall. /n"
				+ "There are four questions and you must answer three of them correctly to pass. /n"
				+ "Hopefully you brought some good luck with you.");
		Scanner in = new Scanner(System.in);
		String response;
		boolean valid = false;
		if(player.getKnowledge() >= 200){System.out.println("You have acquired enough knowledge so that your score has been /n"
		+ "incremented by 1. Good job!"); score++;}		
		
		while (!valid){
			System.out.println("First question: T/F The president of Truman's name is /n"
					+ "Dr. Leroy Piano. (Enter T/F)");
			if (player.amuletWon()){System.out.println("The amulet indicates the answer is false.");}
			response = in.nextLine();
			if (response.equals("T")){System.out.println("Incorrect.");valid = true;}
			if (response.equals("F")){System.out.println("Correct."); score++; valid = true;}
			else {invalidResponse();}
		}
		valid = false;
		while (!valid){
			System.out.println("Second question: T/F Truman is famous for squirrels. (Enter T/F)");
			if (player.amuletWon()){System.out.println("The amulet indicates the answer is true.");}
			response = in.nextLine();
			if (response.equals("T")){System.out.println("Correct.");valid = true;score++;}
			if (response.equals("F")){System.out.println("Incorrect.");  valid = true;}
			else {invalidResponse();}
		}
		valid = false;
		MultipleChoice prison = new MultipleChoice("Third question: Which hall is designed similarly to a prison? ", "MO", "Ryle", "C-Hall", "Violette", 'a');
	if (player.amuletWon()){System.out.println("The amulet tells you MO is the answer.");}
		prison.askQuestion();
	
	boolean a = prison.answerQuestion(in.next().charAt(0));
	if (a) {score++; System.out.println("Correct.");}
	else {System.out.println("Incorrect.");}
	 
	MultipleChoice colors = new MultipleChoice("Last question: The Truman school colors are: ", "gold-blue", "purple-black", "purple-white", "white-black", 'c');
	if (player.amuletWon()){System.out.println("The amulet tells you the colors are purple and white");}
	colors.askQuestion();
	a = colors.answerQuestion(in.next().charAt(0));
	if (a) {score++; System.out.println("Correct.");}
	else {System.out.println("Incorrect.");}
	
	in.close();
	if (score >= 3){System.out.println("You have passed the final and won the game. Did the amulet of Yendor help you?");}
	else {System.out.println("You have failed the final and lost the game. Maybe you should try again and look for a certain amulet.");}
	}
	
	public void invalidResponse(){
		System.out.println("Invalid Response");
	}
	
}

