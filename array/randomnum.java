package array;
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class randomnum {
	public static void main(String args[])
	{
		Random rand = new Random();
		System.out.println("How many people are you rolling for?");
		Scanner scan = new Scanner(System.in);
		int lay = scan.nextInt();
		ArrayList<Integer> list = new ArrayList<Integer>(lay);
		boolean check = true;
		int count = 1;
		while(true)
		{
			System.out.println("Would you like to roll?");
			String markee = scan.next();
			if(markee.toLowerCase().equals("y"))
			{
				for(int i = 0; i<lay; i++)
				{
					list.add(i);
				}
				while(list.size() > 0)
				{
				int index = rand.nextInt(list.size());
				System.out.println("Person "+count+": 	"+(list.remove(index)+1));		
				count++;
				}
			}
			else if(markee.toLowerCase().equals("n"))
			{
				System.exit(0);
			}
			else
			{
				System.out.println("Invalid input, please try again.");
			}
			count = 1;
		}
	}
}
