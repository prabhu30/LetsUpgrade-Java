import java.util.Scanner;

public class Game{
	
	QuizApp[] questions = new QuizApp[3];
	Player player = new Player();
	
	String[] question = {"Who i the strongest Avenger","What is closest planet to sun","What is the capital of australia?"};
	String[] option1 = {"ironman","Earth","Sydney"};
	String[] option2 = {"Thor","Venus","Perth"};
	String[] option3 = {"Hulk","Mercury","Melbourne"};
	String[] option4 = {"Dr Strange","Jupiter","Canberra"};

	public void initGame(){
		for(int i=0;i<3;i++){
			questions[i] = new QuizApp();
		}
	}

	public void play()
	{
		player.getDetails();
		for(int i=0;i<3;i++)
		{
			boolean status = questions[i].askQuestion();
			if(status==true)
			{
				System.out.println("Well Played!!!");
				System.out.println();
				player.score++;
			}
			else{
				System.out.println("Sorry :( Better luck next time!!!");
				System.out.println();
			}
		}
		System.out.println(player.name+" your score is "+player.score+" out of "+player.totscore);
		
	}
}
