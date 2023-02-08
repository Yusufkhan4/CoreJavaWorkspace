package Assign12;

public class BookCRUD {
	Book bookArray[];
	Book searchedBook;
	
	
	public static int i = 0;
	
	public BookCRUD(){
		bookArray = new Book[5];
//		try {
//			bookArray = new Book[-5];
//		}catch(NegativeArraySizeException e){
//			System.out.println("negative array size exception occured!!");
//			System.out.println(e);
//		}catch(Exception e) {
//			System.out.println(e);
//		}
		
	}
	
	public BookCRUD(int size){
		bookArray = new Book[size];
	}
	
	public boolean addBook(Book book) {
		if(book!=null) {
			bookArray[i] = book;
			i++;
			System.out.println("book added till previous index of: "+i);
			return true;
		}
		else {
			return false;
		}
	}
	
	public void display() {
//		for(int j=0;j<i;j++) {
//			System.out.println(bookArray[j]);
//		}
		try {
			for(int j=0;j<i;j++) {
				System.out.println(bookArray[j+8]);
			}
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Array index exception occured!!");
			System.out.println(e);
		}catch(Exception e) {
			System.out.println(e);
		}
	
	
}

	public Book searchBook(int id) {
			for(int j = 0;j<i;j++) {
				if(bookArray[j].getBookId() == id) {
					searchedBook = bookArray[j];
					break;
				}
			}
		return searchedBook;
	}
	
	
	
}