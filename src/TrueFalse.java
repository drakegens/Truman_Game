
public class TrueFalse extends Question {
	private boolean answer;
	public TrueFalse(String d, boolean t){
		super(d);
		answer = t;
	}
	public boolean answerQuestion(boolean a){
		if (a == answer){return true;}
		else {return false;}
	}

}
