//Assignment -18-8
package comparatorDemo;

import java.util.Scanner;
import java.util.TreeSet;

public class compareBook {
	
	public static void main(String args []) {
		Books b1 = new Books(4, "Lord of the Rings", 299);
		Books b2 = new Books(7, "To Kill a Mockingbird", 279);
		Books b3 = new Books(2, "The Great Gatsby", 953);
		Books b4 = new Books(4, "Invisible Man", 202);
		Books b5 = new Books(1, "One Hundred Years of Solitude", 736);
		Books b6 = new Books(9, "Beloved", 602);
		Books b7 = new Books(8, "Harry Potter", 1061);
		Books b8 = new Books(3, "A Passage to India", 400);
		Scanner sc = new Scanner(System.in);
		
		int ch = 0;
		do{
			System.out.println("Select an option: \n1. Sort By book Id \n2. Sort by book Name \n3. Sort by Book Price");

			ch = sc.nextInt();
			switch(ch) {
			case 1: TreeSet t1 = new TreeSet(new MyComparatorId());
				t1.add(b1);
				t1.add(b2);
				t1.add(b3);
				t1.add(b4);
				t1.add(b5);
				t1.add(b6);
				t1.add(b7);
				t1.add(b8);
				System.out.println(t1);
				
				break;
			case 2:
				TreeSet t2 = new TreeSet(new MyComparatorName());
				t2.add(b1);
				t2.add(b2);
				t2.add(b3);
				t2.add(b4);
				t2.add(b5);
				t2.add(b6);
				t2.add(b7);
				t2.add(b8);
				System.out.println(t2);
				break;
			case 3:
				TreeSet t3 = new TreeSet(new MyComparatorPrice());
				t3.add(b1);
				t3.add(b2);
				t3.add(b3);
				t3.add(b4);
				t3.add(b5);
				t3.add(b6);
				t3.add(b7);
				t3.add(b8);
				System.out.println(t3);
				break;
				
			case 4:
				System.out.println("Exit");
				break;
			default:
				System.out.println("Invalid option");
				break;
			}
			
		}while(ch!=4);
	}
	
	

}
