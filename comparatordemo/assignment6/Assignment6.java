package assignment6;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import comparatordemo.CompareOnId;
import comparatordemo.CompareOnName;
import comparatordemo.CompareOnPrice;

public class Assignment6 {
	
	public static void main(String[] args) {
		Set<Book1> books=null;
		
		int ch=0;
		Scanner sc=new Scanner(System.in);
		do {
			System.out.println("1: sort on id 2: sort on name 3: sort on price 4: back");
			ch=sc.nextInt();
			switch (ch) {
			case 1:
					books=new TreeSet<>(new CompareOnId()); 
					books.add(new Book1(2,"Java",600));
					books.add(new Book1(2,"PHP",300));
					books.add(new Book1(3,"Java",600));
					books.add(new Book1(4,"PHP",300));
					books.add(new Book1(12,"CPP",400));
					books.add(new Book1(10,"Core Java",600));
					books.add(new Book1(13,"Java Basics",700));
					books.add(new Book1(15,"Learn Python",650));
					books.add(new Book1(14,"Web Basics",550));
				break;
			case 2:
				books=new TreeSet<>(new CompareOnName());
				books.add(new Book1(2,"Java",600));
				books.add(new Book1(1,"PHP",300));
				books.add(new Book1(3,"Java",600));
				books.add(new Book1(4,"PHP",300));
				books.add(new Book1(12,"CPP",400));
				books.add(new Book1(10,"Core Java",600));
				books.add(new Book1(13,"Java Basics",700));
				books.add(new Book1(15,"Learn Python",650));
				books.add(new Book1(14,"Web Basics",550));
				break;
			case 3:
				books=new TreeSet<>(new CompareOnPrice()); 
				books.add(new Book1(2,"Java",600));
				books.add(new Book1(1,"PHP",300));
				books.add(new Book1(3,"Java",600));
				books.add(new Book1(4,"PHP",300));
				books.add(new Book1(12,"CPP",400));
				books.add(new Book1(10,"Core Java",600));
				books.add(new Book1(13,"Java Basics",700));
				books.add(new Book1(15,"Learn Python",650));
				books.add(new Book1(14,"Web Basics",550));
				break;
			case 4:
				break;
			default: System.out.println("Wrong choice");
				break;
			}
			if(ch!=4) {
			System.out.println("After sorting...");
			for(Book1 bk:books)
				System.out.println(bk);
			}
		}
		while(ch!=4);
		
		System.out.println("Application ended");
		
	    
	}
	

}
