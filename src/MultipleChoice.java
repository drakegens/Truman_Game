import java.util.ArrayList;


public class MultipleChoice extends Question {
	ArrayList<String> choices;
	char answer;
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
	if (answer == a){ return true;}
	else {return false;}
}
public String getChoices(int i){
	return choices.get(i);
}
}
