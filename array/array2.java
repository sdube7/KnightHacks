package array;
import java.util.Scanner;
import java.util.Arrays;

public class array2 {
	public static void main(String []args)
	{
	Scanner scan = new Scanner(System.in);
	int arraycnt2 = 0;
	int arraycnt = 0;
	arraycnt = scan.nextInt();
	int array[] = new int[arraycnt];
	for(int i = 0; i<arraycnt; i++)
	{
		arraycnt2 = scan.nextInt();
		array[i]= arraycnt2;
	}
	Arrays.sort(array);
	for(int x = 0; x<=1; x++)
	{
		System.out.print(array[x] + " ");
	}
	System.out.println("");
	}
} 
