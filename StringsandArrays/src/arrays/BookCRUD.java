package arrays;
/*DAO : Data Access Object : It works on POJO*/
public class BookCRUD{
	Book bookArray[];
	public static int i=0;
	
	public BookCRUD() {
		bookArray=new Book[5];
	}
	public BookCRUD(int size) {
		bookArray=new Book[size];
		System.out.println(bookArray.length);
	}
	
	public boolean addBook(Book book) {
		 if(book!=null) {
				bookArray[i]=book;
				i++;
				return true;
		 }
		 else
			 return false;
	}
	public void display() {
		for(Book bk: bookArray) 
			System.out.println(bk);
	}
	
	public Book searchBook(int bookId) {
		Book searchedBook=null;
		for(Book bk:bookArray) {
			if(bk.getBookId()==bookId) {
				searchedBook=bk;
				break;
			}
		}// ended
		return searchedBook;  // null will returned if no book found
	}
	
	public boolean updateBoot(Book updatedbook) {
		boolean replaced= false;
		for(int j=0;j<i;j++) {
			if(bookArray[j].getBookId()==updatedbook.getBookId()) {
				bookArray[j]=updatedbook;
				replaced=true;
				break;
			}
		}
		return replaced;
	}
	
}
