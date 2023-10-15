package question3;
import java.util.Scanner;
public class FoodBill {
	static double itemPrice;
	static boolean ordering = true;
	static Scanner sc = new Scanner(System.in);
	
	public static void menu() {
		System.out.println("1. Dosa \n2. Samosa \n3. Idli \n4. Pohe \n5. Upma \n6. Shira \n7. Misal Pav \n8. VadaPav \n9. Uthappa \n10.Total");
		System.out.println("Please Enter your item number : ");
	}
	
	public static double itemPrice(int itemChoice) {
		if(itemChoice==1) {
			System.out.println("You have ordered Dosa...");
			itemPrice= 40.0;
		}
		else if(itemChoice==2) {
			System.out.println("You have ordered Samosa...");
			itemPrice= 15.0;
		}
		else if(itemChoice==3) {
			System.out.println("You have ordered Idli...");
			itemPrice= 30.0;
		}
		else if(itemChoice==4) {
			System.out.println("You have ordered Pohe...");
			itemPrice= 25.0;
		}
		else if(itemChoice==5) {
			System.out.println("You have ordered Upma...");
			itemPrice= 30.0;
		}
		else if(itemChoice==6) {
			System.out.println("You have ordered Shira...");
			itemPrice= 60.0;
		}
		else if(itemChoice==7) {
			System.out.println("You have ordered Misal Pav...");
			itemPrice= 65.0;
		}
		else if(itemChoice==8) {
			System.out.println("You have ordered VadaPav...");
			itemPrice= 20.0;
		}
		else if(itemChoice==9) {
			System.out.println("You have ordered Uthppa...");
			itemPrice= 50.0;
		}
		return itemPrice;
		
	}
	
	public static int quantity() {
		System.out.println("Enter quantity");
        int quantity = sc.nextInt();
        return quantity;
	}

	public static void main(String[] args) {
		int itemCount;

		int menuOption;
		  int foodItem = 0;
		  double runningTotal=0;
		  do{
		    menu();
		    menuOption = sc.nextInt();
		    switch(menuOption){
		      case 1:
		        foodItem = 1;
		        itemCount=quantity();
		        runningTotal =runningTotal+ (itemCount * itemPrice(foodItem)); 
		        break;
		      case 2:
		        foodItem = 2;
		        itemCount=quantity();
		        runningTotal =runningTotal+ (itemCount * itemPrice(foodItem));
		        break;
		      case 3:
		        foodItem = 3;
		        itemCount=quantity();
		        runningTotal =runningTotal+ (itemCount * itemPrice(foodItem));
		        break;
		      case 4:
			    foodItem = 4;
			    itemCount=quantity();
			    runningTotal =runningTotal+ (itemCount * itemPrice(foodItem));
			    break;
		      case 5:
				foodItem = 5;
				itemCount = quantity();
				runningTotal = runningTotal + (itemCount * itemPrice(foodItem));
				break;
		      case 6:
		        foodItem = 6;
		        itemCount=quantity();
		        runningTotal =runningTotal+ (itemCount * itemPrice(foodItem));
		        break;
		      case 7:
		        foodItem = 7;
		        itemCount=quantity();
		        runningTotal =runningTotal+ (itemCount * itemPrice(foodItem));
		        break;
		      case 8:
		        foodItem = 8;
		        itemCount=quantity();
		        runningTotal =runningTotal+ (itemCount * itemPrice(foodItem));
		        break;
		      case 9:
		        foodItem = 9;
		        itemCount=quantity();
		        runningTotal =runningTotal+ (itemCount * itemPrice(foodItem));
		        break;
		      case 10:
		    	  ordering = false;
		    	  System.out.println(runningTotal);
		          System.out.println("Enjoy your meal...!!"); 
		        break;
		      default:
		        System.out.println("Invalid option.");
		    }
		  } while(ordering);
		  System.out.println("Total amount : " + runningTotal);
		}
	

}
