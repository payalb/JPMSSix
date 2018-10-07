package com.java1;
import com.java.Demo1;
public class Demo2 {
	
	public void print() {
		System.out.println("Printing from "+ this.getClass().getName());
		
	}
 public static void main(String args[]) {
	 Demo2 obj= new Demo2();
	 obj.print();
 }
}
