
public abstract class NPC {
	private String name;
	//will also implement questions
	private Question q;
	public NPC(String name)
		{this.name = name;
	
		}
	public String getName(){
		return name;
	}
	public void addQuestion(Question q){
		this.q = q;
	}
	public void askQuestion(){
		if (this.q instanceof TrueFalse){
			System.out.println(q.getDesc());
		}
		if (this.q instanceof MultipleChoice){
			System.out.println(q.getDesc());
			System.out.println(((MultipleChoice) q).getChoices(0));
			System.out.println(((MultipleChoice) q).getChoices(1));
			System.out.println(((MultipleChoice) q).getChoices(2));//handle user input in main quest class?
			System.out.println(((MultipleChoice) q).getChoices(3));
		}
	}
}
