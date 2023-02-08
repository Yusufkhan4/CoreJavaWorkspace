package Assign12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CRUDDemo {
	Book bookArray[]=new Book[5];
	public static int i=0;
	
	
public static void main(String[] args) throws IOException {
	
	BookCRUD book = new BookCRUD();
	CRUDDemo crud=new CRUDDemo();
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	Scanner sc=new Scanner(System.in);
		int ch=0;
//		try {
		do {
			System.out.println("1:ADD BOOK \n2:UPDATE BOOK \n3:DELETE BOOK \n4:SEARCH BOOK \n5:DISPLAY BOOKS \n6:BACK");
			ch=sc.nextInt();
		
			switch (ch) {
			case 1:
				System.out.println("Enter Book Id");
				int id=sc.nextInt();
				System.out.println("Enter Book Name");
				String name=br.readLine();
				System.out.println("Enter Book Price");
				double price=sc.nextDouble();
				Book b1=new Book(id,name,price); // Book Object created
				boolean b=book.addBook(b1);
				if(b)
					System.out.println("Book Added successfully...");
				else
					System.out.println("Book insertion failed...");
				break;
			case 2:
				System.out.println("Enter existing id of book which you want to update");
				id = sc.nextInt();
				Book searchedBook = book.searchBook(id);
				
				if(searchedBook != null) {
					System.out.println("What you want to update 1: Name 2: Price 3: Both");
					int ch1 = sc.nextInt();			
					switch(ch1) {
					case 1:
						System.out.println("Enter new Name");
						name = br.readLine();
						
						
					}
				}
				break;
			case 3:
				break;
			case 4:
				System.out.println("Enter id to search book");
				id = sc.nextInt();
				searchedBook = book.searchBook(id);
				System.out.println(searchedBook);
				break;
			case 5:
				book.display();
				break;
			case 6:
				break;
			default:
				break;
		}
		}while(ch!=6);
//		}
//		catch(InputMismatchException e) {
//			System.out.println("Exception Occured!!");
//			System.out.println(e);
//		}
	}
	

}