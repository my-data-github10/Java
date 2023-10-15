package question1;

import java.util.Scanner;

public class Wrapperclass {
	
public static void main(String[] args) {
		
		int num;
		System.out.println("java Test");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		num = sc.nextInt();
		System.out.println("Given Number : "+num);
		
		String binary = Integer.toBinaryString(num);  //Binary Conversion
		System.out.println("Binary conversion : "+binary);
		
		String octal = Integer.toOctalString(num); //Octal Conversion 
		System.out.println("Octal Conversion : "+octal);
		
		String hex = Integer.toHexString(num).toUpperCase(); //Hexadecimal Conversion
		System.out.println("Hexadecimal conversion : "+hex);

	}
	

}
