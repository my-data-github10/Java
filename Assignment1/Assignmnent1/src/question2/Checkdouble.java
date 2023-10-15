package question2;
import java.util.Scanner;

public class Checkdouble {
	

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Num1 : ");
		
		if (sc.hasNextDouble()) 
		{
			double num1 = sc.nextDouble();
			System.out.println("Enter Num2 : ");
			if(sc.hasNextDouble()) 
			{
				double num2 = sc.nextDouble();
				
				double num3 = (num1+num2)/2;
				System.out.println("Avg : "+num3);
			}
			else 
			{
				System.out.println("TypeNotFoundExeption...");
				System.exit(0);
			}
		} else 
		{
			System.out.println("TypeNotFoundExeption...");
			System.exit(0);
		}
	}
}
