package com.sunbeam;

import java.util.*;
public class EmployeeMain {

	public static int menu() {
		int choice;
		System.out.println("0. EXIT");
		System.out.println("1. add ");
		System.out.println("2. delete");
		System.out.println("3. ﬁnd");
		System.out.println("4. sort");
		System.out.println("5. edit");
		System.out.println("Enter the choice :");
		choice = new Scanner(System.in).nextInt();
		return choice;
	}
	
	public static void main(String[] args) {
		List<Employee> list = new LinkedList<>();
		int choice;
		Employee e;
		int index;
		while ((choice=menu())!=0) {
			
			switch (choice) {
			case 1:
				e = new Employee();
				e.accept();
				list.add(e);
				break;

			case 2:{
				System.out.println("Enter the Employee ID which you want to delete :");
				int id = new Scanner(System.in).nextInt();
				e = new Employee();
				e.setEmpid(id);
				if(list.contains(e)) {
					index = list.indexOf(e);
					list.remove(index);
					System.out.println("successfully deleted...");
					}
				else {
					System.out.println("Not Found...");
				}
			}
				break;
			case 3:{
				System.out.println("Enter the Employee id which Employee you want to find :");
				e = new Employee();
				int id = new Scanner(System.in).nextInt();
				e.setEmpid(id);
				index = list.indexOf(e);
				if(index == -1)
					System.out.println("Employee is not found :");
				else {
					System.out.println("your Employee data is :");
					e = list.get(index);
					System.out.println(e);
				}}
				break;
			case 4:{
				class SortEmp implements Comparator<Employee>{

					@Override
					public int compare(Employee e1, Employee e2) {
						return e1.empid - e2.empid;
					}
				}
				SortEmp sm = new SortEmp();
				list.sort(sm);
				System.out.println(list);
			}
				break;
			case 5:{
				System.out.println("Enter emp id to be modified: ");
				int id = new Scanner(System.in).nextInt();
				Employee key = new Employee();
				key.setEmpid(id);
				index = list.indexOf(key);
				if(index == -1)
				System.out.println("Employee not found.");
				else {
				Employee oldEmp = list.get(index);
				System.out.println("Employee Found: " + oldEmp);
				System.out.println("Enter new information for the Employee");
				Employee newEmp = new Employee();
				newEmp.accept();
				list.set(index, newEmp);
				}
				
			}
				break;
			default:
				System.out.println("Please enter valid choice...");
				break;
			}
			
		}
		
		
		
		
	}

}