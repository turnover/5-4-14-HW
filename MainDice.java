
public class MainDice 
{

	public static boolean replay;
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		RandomGenerator dice = new RandomGenerator(3);
		RandomGenerator game = new RandomGenerator(3);
		
		do
		{
			dice.Throw(dice.Bounces);
			game.AddThrows();
			dice.Value();
			System.out.println("The dice has landed on "+dice.num1);
			game.GetThrows();
			game.Retry();
		}
		while(replay == true);
		
	}
}


// Need to ask users the number of dices and number of throw, please.
