package assignment6;

public class Book1 {
		private int bookId;
		private String bookName;
		private double bookPrice;
		public Book1(int bookId, String bookName, double bookPrice) {
			super();
			this.bookId = bookId;
			this.bookName = bookName;
			this.bookPrice = bookPrice;
		}
		public int getBookId() {
			return bookId;
		}
		public void setBookId(int bookId) {
			this.bookId = bookId;
		}
		public String getBookName() {
			return bookName;
		}
		public void setBookName(String bookName) {
			this.bookName = bookName;
		}
		public double getBookPrice() {
			return bookPrice;
		}
		public void setBookPrice(double bookPrice) {
			this.bookPrice = bookPrice;
		}
		@Override
		public String toString() {
			return "Book [bookId=" + bookId + ", bookName=" + bookName + ", bookPrice=" + bookPrice + "]";
		}
}