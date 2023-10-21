package com.sunbeam;
import java.util.*;

class Box<T> {
	private T obj;

	public Box() {
		this.obj = obj;
	}

	public T getObj() {
		return obj;
	}

	public void setObj(T obj) {
		this.obj = obj;
	}
}

public class BoxTest {

	public static void printDisplayableBox(Box<? extends Displayable>b) {
		b.getObj().show();
	}
	
	public static void printBox(Box<?>b) {
		System.out.println(b.getObj().toString());
	}
	
	public static void main(String[] args) {
		Box<Person> P1= new Box<>();
		P1.setObj(new Person("ABC",25));
		printDisplayableBox(P1);
		
		Box<Date> D1= new Box<>();
		D1.setObj(new Date(1,1,2000));
		printDisplayableBox(D1);
}
}