package com.sunbeam;

import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int choice;

		do {
			System.out.println("0.EXIT\n1.ADD\n2.DELETE\n3.UPDATE\n4.DISPLAY\n------------------------");
			choice = scanner.nextInt();
			switch (choice) {
			case 1:

				try (UserDao dao = new UserDao()) {
					System.out.println("Enter first name = ");
					scanner.nextLine();
					String fname = scanner.nextLine();
					System.out.println("Enter last name = ");
					String lname = scanner.nextLine();
					System.out.println("Enter email = ");
					String email = scanner.nextLine();
					System.out.println("Enter password = ");
					String pwd = scanner.nextLine();
					System.out.println("Enter dob = ");
					String dob = scanner.nextLine();
					System.out.println("Enter status = ");
					Byte status = scanner.nextByte();
					System.out.println("Enter role = ");
					scanner.nextLine();
					String role = scanner.nextLine();

					User u = new User(fname, lname, email, pwd, dob, status, role);
					int cnt = dao.addUser(u);
					System.out.println("rows inserted : " + cnt);
				} // dao.close();
				catch (Exception e) {
					e.printStackTrace();
				}

				break;
			case 2:
				try (UserDao dao = new UserDao()) {
					System.out.println("Enter id to delete = ");
					int id = scanner.nextInt();
					int cnt = dao.deleteUser(id);
					System.out.println("rows deleted : " + cnt);
				} // dao.close();
				catch (Exception e) {
					e.printStackTrace();
				}
				break;
			case 3:
				try (UserDao dao = new UserDao()) {

					System.out.println("Enter id to update whole record = ");
					int id = scanner.nextInt();

					System.out.println("Enter first name = ");
					scanner.nextLine();
					String fname = scanner.nextLine();
					System.out.println("Enter last name = ");
					String lname = scanner.nextLine();
					System.out.println("Enter email = ");
					String email = scanner.nextLine();
					System.out.println("Enter password = ");
					String pwd = scanner.nextLine();
					System.out.println("Enter status = ");
					Byte status = scanner.nextByte();

					User u = new User(fname, lname, email, pwd, status);

					int cnt = dao.updateUser(u, id);

					System.out.println("rows updated : " + cnt);
				} // dao.close();
				catch (Exception e) {
					e.printStackTrace();
				}
				break;
			case 4:
				List<User> list = new ArrayList<User>();
				try(UserDao dao = new UserDao()){
					
					 list = dao.displayAll();
					 list.forEach(c->System.out.println(c));
					
				} catch (SQLException e) {
					
					e.printStackTrace();
				}
				
				break;
			}

		} while (choice != 0);

	}

}