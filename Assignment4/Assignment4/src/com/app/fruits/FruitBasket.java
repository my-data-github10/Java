package com.app.fruits;

import java.util.Scanner;

class Menu{
	Scanner sc= new Scanner(System.in); 
	
	  public int menu1()
	  {
		  
		  int choice;
		  System.out.println("0 Exit");
		  System.out.println("1 Add Apple");
		  System.out.println("2 Add Orange");
		  System.out.println("3 Add mango");
		  System.out.println("4 Display names of all fruits in the basket.");
		  System.out.println("5 Display name,color,weight , taste of all fresh fruits , in the basket.");
		  System.out.println("6 Display tastes of all stale(not fresh) fruits in the basket.");
		  System.out.println("7 Mark a fruit as stale");

		  
		  choice=sc.nextInt();
		  return choice;
	  }
  }

public class FruitBasket {
	
	public static void main(String[] args) {
	
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the size of basket = ");
		int size=sc.nextInt();
		int count=0;
		Fruit []basket=new Fruit[size];
		Menu m1=new Menu();
		int choice;
		while ((choice=m1.menu1())!=0)
		{
			switch(choice)
			{
			case 1:
				if(count<size-1)
				{	
				basket[count]=new Apple();
				basket[count].acceptData();
				count++;
				}
				else
				{
					System.out.println("basketay is full");
				}
			break;
			case 2:
				if(count<size-1)
			  {
				basket[count]=new Orange();
				basket[count].acceptData();
				count++;
			   }
				else
				{
					System.out.println("basketay is full");
				}
			break;
			case 3:
				if(count<size)
				  {
				basket[count]=new Mango();
				basket[count].acceptData();
				count++;
				  }
				else
				{
					System.out.println("basketay is full");
				}
			break;
			case 4:
				for(int i=0;i<count;i++)
				{
					String name=basket[i].getName();
					System.out.println("Name is ="+name);
				}
					
			break;
			case 5:
				for(Fruit fruit :basket)
				{
//					
					if(fruit!=null)
					{
					fruit.displayData();
					String testOfFruit=fruit.taste();
				    System.out.println("Test is "+testOfFruit);
					}
					
				}	
			break;
			case 6:
				for(int i=0;i<count;i++)
					
					
					if(basket[i].isFresh()!=true)
					{
						 String testOfFruit=basket[i].taste();
						System.out.println("Test is "+testOfFruit);
					}
				
			break;
			case 7:
				
				System.out.println("Enter the index you want to change ");
				int index=sc.nextInt();
	     		  if(index<size)
     			  {
	     			 basket[index].setFresh(false);
     			  }
	     		  else
	     		  {
	     		   System.out.println("Please enter the valid index.......");
	     		  }
			break;
			
			default:
				System.out.println("Please enter the valid choice....):");
				
			   break;		
			}
			
		}
	}
}