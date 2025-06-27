package LinkedList;

import java.util.LinkedList;
import java.util.Scanner;

public class Auto_Boxing {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 LinkedList list = new LinkedList();
		 
		 int a = 10;
		 //Boxing(converting primitive to non-Primitive)
		 Integer i  = new Integer(a);
		 System.out.println("The Auto_boxed Integer: "+i);
		 
		 //Unboxing(Non primitive to primitive)
		 int b = i;
		 System.out.println("The Unboxed Integer: "+b);
		 
		 
		 

	}

}
