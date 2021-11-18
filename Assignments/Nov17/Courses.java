package geek1;

import java.util.Scanner;

public class Courses {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String br;
		int year;
		System.out.println("Enter the Branch: (in CAPS)\n1. ECE\n2. CSE\n3. MECH");
		br=sc.nextLine();
		System.out.println("Enter the Year of study :");
		year=sc.nextInt();
		System.out.println("\nCourses :");
		
		//Courses for first year common for all branches
		if(year == 1)
		{
			System.out.println("# English\n# Maths\n# Science");
		}
		
		//Courses for second year
		else if(year == 2)
		{
			switch(br)
			{
			case "ECE":
				System.out.println("# Micro processors\n# Logic switching theory");
				break;
			case "CSE":
				System.out.println("# Operating System\n# Java\n# Data Structure");
				break;
			case "MECH":
				System.out.println("# Drawing \n# Manufacturing Machines");
				break;
			default:	
				System.out.println("Invalid Choice");
			}
		}
		
		//Courses for third year
		else if(year == 3)
		{
			switch(br)
			{
			case "ECE":
				System.out.println("# Fundamentals of Logic Design\n# Microelectronics");
				break;
			case "CSE":
				System.out.println("# Computer Organization\n# MultiMedia");
				break;
			case "MECH":
				System.out.println("# Internal Combustion Engines\n# Mechanical Vibration");
				break;
			default:	
				System.out.println("Invalid Choice");
			}
		}
		//Courses for fourth year
		else if(year == 4)
		{
			switch(br)
			{
			case "ECE":
				System.out.println("# Embedded System\n# Image Processing");
				break;
			case "CSE":
				System.out.println("# Data Communication and Networks\n# MultiMedia");
				break;
			case "MECH":
				System.out.println("# Production Technology\n# Thermal Engineering");
				break;
			default:	
				System.out.println("Invalid Choice");
			}
		}
		else
		{
			System.out.println("Enter year of study between 1 to 4");
		}
	}
}
