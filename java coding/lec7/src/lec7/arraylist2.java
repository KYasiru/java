package lec7;
import java.util.*;
import java.util.ArrayList;

public class arraylist2 {
	public static void main(String[] args) {
		//creat an array list;
		ArrayList<String> a1 = new ArrayList<String>();
		
		System.out.println("Initial size of a1:"+a1.size());
		
		//Add element to the array list
		
		a1.add("c");
		a1.add("a");
		a1.add("e");
		a1.add("b");
		a1.add("d");
		a1.add("f");
		a1.add(1,"A2");
		
		System.out.println("Size of a1 after additions:"+ a1.size());
		
		//Display the array List
		System.out.println("contents of a1:"+a1);
		
		//remove elements from the array list
		a1.remove("f");
		a1.remove(2);
		
		System.out.println("Size of a1 after delection:"+a1.size());
		System.out.println("Contents of a1:"+a1);
		
	}

}
