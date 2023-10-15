package question2;
import java.util.Scanner;
public class Employee {

	String 	firstName ;
	String lastName ;
	double salary;
	
	
	Scanner sc = new Scanner(System.in);
	public Employee() {
		
	}
	
	public Employee(String firstName, String lastName, double salary) {
		this.firstName=firstName;
		this.lastName=lastName;
		this.salary=salary;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	public void accept() {
		System.out.println("Enter the First Name : ");
		firstName = sc.next();
		
		System.out.println("Enter the Last NAme : ");
		lastName = sc.next();
		
		System.out.println("Enter the Monthly Salary : ");
		double sal=sc.nextDouble();
		if(sal>0)
			setSalary(sal);
		
	}
	public double ySal(double salary) {
		return salary*12;
	}
	
	public void display() {
		System.out.println("Name : "+firstName+" "+lastName);
		System.out.println("Yearly Salary : "+ySal(salary));
		System.out.println("Yearly Salary with bonus : "+calcSal(salary));
		
	}
	
	public double calcSal(double salary) {
		double x = ySal(salary);
		return x*1.1 ;
	}
}
