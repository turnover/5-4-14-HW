import java.util.Random;
import java.util.Scanner;

public class RandomGenerator 
{
	Random random = new Random();
	Scanner input = new Scanner(System.in);
	
	String word1;
	public int num1;
	public int num2;
	public int rolls;
	public int num3;
	public int Bounces;
	public int Throws = 0;
	
	public void GetThrows()
	{
		System.out.println("You rolled "+Throws+" Time(s)");
	}
	public void AddThrows()
	{
		Throws++;
	}
	public void Retry()
	{
		System.out.println("Do you want to roll again?(yes or no): ");
		word1 = input.nextLine();
		
		switch(word1.toLowerCase())
		{
			case"yes":
			{
				MainDice.replay=true;
				break;
			}
			case "no":
			{
				MainDice.replay=false;
				break;
			}
			default:
			{
				System.out.println("You did not type yes or no");
				break;
			}
		}
	}
	public int Throw()
	{
		num1 = random.nextInt(6)+1;
		return num1;
	}
	public int Value()
	{
		num1 = num2;
		return num1;
	}
	public int Throw(int Bounces)
	{
		rolls=Bounces;
		num1 = 0;
		do
		{
			num1 = num1 +random.nextInt(6)+1;
			rolls++;
		}
		while (rolls>0);
		
		num2 = num1/rolls;
		return num2;
	}
	public RandomGenerator(int num3)
	{
		Bounces = num3;
	}
	
}

