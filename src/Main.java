import java.util.Scanner;

public class Main {
	String name;
	int age;
	String joinDate;
	String position;
	int points;
	String rule;
	boolean manager;


	
	public Main(String name, int age, String joinDate, String position, int points, String rule, boolean manager) {
		System.out.println("Name is: " + name);
		System.out.println("Age is: " + age);
		System.out.println("Joined in: " + joinDate);
		System.out.println("Experience in years: " + points);
		System.out.println("Rule in the organization: " + rule);
		System.out.println("Is the member one of the managers: " + manager);
	}
	
	   public static void main(String[] args)
	   {
		   new members();
	   }	   
}

