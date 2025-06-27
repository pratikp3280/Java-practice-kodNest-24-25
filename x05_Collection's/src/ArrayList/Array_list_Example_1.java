package ArrayList;

import java.util.ArrayList;

public class Array_list_Example_1 {

	public static void main(String[] args) {
		ArrayList veg = new ArrayList();
		veg.add("Potato");
		veg.add("Tomato");
		veg.add("Ginger");
		veg.add("Brinjal");
		System.out.println("Vegetable Arraylist: " + veg);
		System.out.println();
		
		ArrayList fruits = new ArrayList();
		fruits.add("Mango");
		fruits.add("Banana");
		fruits.add("Apple");
		System.out.println("Fruits Arraylist: " + fruits);
		System.out.println();
		
		ArrayList veg_fruits = new ArrayList();
		veg_fruits.addAll(veg);
		veg_fruits.addAll(fruits);
		System.out.println("Veg_Fruits ArrayList" + veg_fruits);
		System.out.println();
		System.out.println("Veg_Fruits item-1: " + veg_fruits.getFirst());
		System.out.println("Veg_Fruits item-2: " + veg_fruits.get(1));
		System.out.println("Veg_Fruits item-last: " + veg_fruits.getLast());
		System.out.println();
		
		
		veg.add("Carrot");
		System.out.println("After adding Carrot: Vegetable Arraylist:\n" + veg);
		veg.remove("Carrot");
		System.out.println("After removing Carrot: Vegetable Arraylist:\n" +veg);
		
		veg.removeAll(veg);
		System.out.println("After removing All vegetables:\n" + veg);

	}

}
