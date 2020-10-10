package array;
import java.util.Scanner;
import java.util.Arrays;

public class array {
	public static void main(String []args)
	{
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		String arr[] = str.split(" ");
		int array[] = new int [arr.length];
		for(int i = 0; i<arr.length; i++)
		{
			array[i] = Integer.parseInt(arr[i]);
		}
		Arrays.sort(array);
		System.out.print(array[0] + " ");
		System.out.println(array[1]);
	}
}
