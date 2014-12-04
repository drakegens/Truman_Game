import java.util.ArrayList;
import java.util.Scanner;


public class MultipleChoice extends Question {
	private ArrayList<String> choices;
	char answer;
	private Scanner in = new Scanner(System.in);
	public MultipleChoice(String desc, String a, String b, String c, String d, char answer){
		super(d);
		choices = new ArrayList<String>();
		choices.add(a);
		choices.add(b);
		choices.add(c);
		choices.add(d);
		this.answer = answer;
	}
	public boolean answerQuestion(char a){
		boolean valid = false;
		while (!valid){
		if (a == 'a' || a == 'b' || a == 'c' || a == 'd'){valid = true;
		if (answer == a){ return true;}
		else {return false;}
		}//end of first if statement
		else{System.out.println("Invalid Response, please enter another ");
		a = in.next().charAt(0);
		}
		}
		return false;
		
		
	}
	public String getChoices(int i){
		return choices.get(i);	
	}
	
	public void askQuestion(){
		System.out.println(super.getDesc());
		System.out.println("a) " + choices.get(0));
		System.out.println("b) " + choices.get(1));
		System.out.println("c) " + choices.get(2));
		System.out.println("d) " + choices.get(3));
	}
}
