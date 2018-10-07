package com.java2;
import com.java.Demo1;
import com.java1.Demo2;

public class Demo3 {
	
	public void print() {
		System.out.println("Printing from "+ this.getClass().getName());
		Demo1 obj1 = new Demo1();
		Demo2 obj2 = new Demo2();
		obj1.print();
		obj2.print();
	}

	public static void main(String args[]) {
		Demo3 obj= new Demo3();
		obj.print();
	}
}
