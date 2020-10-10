import java.util.InputMismatchException;
import java.util.Scanner;

public class projectmain {
	private static person[] arr = new person[100];
	private static int counter = 0;
	public static void main(String []args)
	{
		System.out.println("Welcome to my Personal Management Program");
		Scanner scan = new Scanner(System.in);
		while(true)
		{
			System.out.println("\nChoose one of the options below:\n");
			System.out.println("1 - Enter the information of the faculty");
			System.out.println("2 - Enter the information of the student");
			System.out.println("3 - Print tuition invoice");
			System.out.println("4 - Print faculty information");
			System.out.println("5 - Exit program");
			String selection = scan.next();
			if(selection.equals("1"))
			{
				option1();
			}
			else if(selection.equals("2"))
			{
				option2();
			}
			else if(selection.equals("3"))
			{
				option3();
			}	
			else if(selection.equals("4"))
			{
				option4();
			}
			else if(selection.equals("5"))
			{
				System.out.println("Goodbye!");
				System.exit(0);
			}
			else
			{
				System.out.println("Invalid input, please try again.\n");
			}
		}
	}
	public static void option2()
	{
		Scanner scan = new Scanner(System.in);
		int credithours = 0;
		double gpa = 0;
		String name, id;
		System.out.println("\nEnter student info:\n");
		System.out.print("Name of Student: ");
		name = scan.nextLine();
		System.out.print("ID: ");
		id = scan.nextLine();
		while(true)
		{
			while(true)
			{
				System.out.print("GPA: ");
				try
				{
					gpa = scan.nextDouble();
					break;
				}
				catch(InputMismatchException e)
				{
					System.out.println("Invalid input, please try again.\n");
					scan.next();
				}
			}
			if((gpa) >= 0.00 && (gpa) <= 4.00)
			{
				break;
			}
			else
			{
				System.out.println("The GPA could not be read, please try again.\n");
			}
		}
		while(true)
			{
				while(true)
				{
					System.out.print("Credit Hours: ");
					try
					{
						credithours = scan.nextInt();
						break;
					}
					catch(InputMismatchException e)
					{
						System.out.println("Invalid input, please try again.\n");
						scan.next();
					}
				}
				if((credithours) >= 0 && (credithours) <= 24)
				{
					break;
				}
				else
				{
					System.out.println("The credit hours could not be read, please try again.\n");
				}
			}
		scan.nextLine();
		arr[counter] = new student(credithours, gpa, name, id);
		counter++;
	}
	public static void option3()
	{
		System.out.print("Enter the student's ID: ");
		Scanner scan = new Scanner(System.in);
		int check = 0;
		String id = scan.next();
		int count = 0;
		while(arr[count] != null)
		{
			if(arr[count].getId().equals(id))
			{
				check = 1;
				if(arr[count] instanceof student)
				{
					System.out.println("Student found! \n");
					arr[count].printInfo();
				}
				else
				{
					System.out.println("Sorry - student not found!");
				}
			}
			count++;
		}
		if(check == 0)
		{
			System.out.println("Sorry, "+ id + " does not exist!");
		}
	}
	public static void option1()
	{
		String name, id, rank, department;
		Scanner scan = new Scanner(System.in);
		System.out.println("\nEnter the faculty information below\n");
		System.out.print("Name of the faculty: ");
		name = scan.nextLine();
		System.out.print("ID: ");
		id = scan.nextLine();
		while(true)
		{
			System.out.print("Rank: ");
			rank = scan.next();
			if(rank.toLowerCase().equals("professor"))
				{
					rank = "Professor";
					break;
				}
			else if(rank.toLowerCase().equals("adjunct"))
				{
					rank = "Adjunct";
					break;
				}
			else
			{
				System.out.println("The entered rank is invalid. Please try again\n");
			}
		}
		while(true)
		{
			System.out.print("Department: ");
			department = scan.next();
			if(department.toLowerCase().equals("mathematics"))
			{
				department = "Mathematics";
				break;
			}
			else if(department.toLowerCase().equals("engineering"))
			{
				department = "Engineering";
				break;
			}
			else if(department.toLowerCase().equals("arts"))
			{
				department = "Arts";
				break;
			}
			else if(department.toLowerCase().equals("science"))
			{
				department = ("Science");
				break;
			}
			else
			{
				System.out.println("The entered department is invalid. Please try again\n");
			}
		}
		arr[counter] = new faculty(name, id, department, rank);
		counter++;
	}
	public static void option4()
	{
		System.out.print("Enter the faculty's ID: ");
		Scanner scan = new Scanner(System.in);
		int check = 0;
		String id = scan.next();
		int count = 0;
		while(arr[count] != null)
		{
			if(arr[count].getId().equals(id))
			{
				check = 1;
				if(arr[count] instanceof faculty)
				{
					System.out.println("Faculty found! \n");
					arr[count].printInfo();
				}
				else
				{
					System.out.println("Sorry - faculty not found!");
				}
			}
			count++;
		}
		if(check == 0)
		{
			System.out.println("Sorry, "+ id + " doesn't exist!");
		}
	}
}

//-----------------------------------------------------------------------------------------------------------------------------------------------------

public class faculty extends person{
	private String department;
	private String rank;
	public faculty(String name, String id, String department, String rank)
	{
		super(name, id);
		this.department = department;
		this.rank = rank;
	}
	public faculty()
	{
		this("", "", "", "");
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getRank() {
		return rank;
	}
	public void setRank(String rank) {
		this.rank = rank;
	}
	public void printInfo()
	{
		if(name == null)
		{
			System.out.println("No information to output.\n");
		}
		else
		{
			System.out.println("\n---------------------------------\n");
			System.out.println(name + "");
			System.out.println(department + " Department, " + rank);
			System.out.println("\n---------------------------------\n");
		}
	}
}

//-----------------------------------------------------------------------------------------------------------------------------------------------------

public class student extends person{
	private double gpa;
	private int credithours;
	public student(int credithours, double gpa, String name, String id)
	{
		super(name, id);
		this.gpa = gpa;
		this.credithours = credithours;
	}
	public student()
	{
		this(0, 0, "", "");
	}
	public double getGpa() {
		return gpa;
	}
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	public int getCredithours() {
		return credithours;
	}
	public void setCredithours(int credithours) {
		this.credithours = credithours;
	}
	public void printInfo()
	{
		double student1 = (credithours * 236.45) + 52;
		double discount = 0;
		if(gpa >= 3.85)
		{
			discount = 0.25*student1;
			student1 = student1 - (student1 * 0.25);
		}
		System.out.println("\n---------------------------------\n");
		System.out.println("Name: "+ name + "\nID: " + id + "\nCredit Hours: "+ credithours + "  ($236.45/credit hour)" + "\nFees: $52");
		System.out.printf("Total Payment: $%.2f", student1);
		System.out.printf("            ($%.2f discount applied)\n", discount);
		System.out.println("\n---------------------------------\n");
	}
}

//-----------------------------------------------------------------------------------------------------------------------------------------------------

public abstract class person {
	protected String id;
	protected String name;
	public person(String name, String id)
	{
		this.name = name;
		this.id = id;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public abstract void printInfo();
}