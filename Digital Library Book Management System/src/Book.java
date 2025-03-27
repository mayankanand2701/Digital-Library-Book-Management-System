public class Book
{
	// Instance Variables
	int bookId;
	String title;
	String author;
	String genre;
	String availabilityStatus;
	
	// Constructor to initialize book with values
	public Book(int bookId, String title, String author, String genre, String availabilityStatus) {
		super();
		this.bookId = bookId;
		this.title = title;
		this.author = author;
		this.genre = genre;
		this.availabilityStatus = availabilityStatus;
	}

	// To print the Book Details
	@Override
	public String toString() {
		return "Book [bookId = " + bookId + ", title = " + title + ", author = " + author + ", genre = " + genre
				+ ", availabilityStatus = " + availabilityStatus + "]";
	}
	
	// Getters & Setters
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	public String getAvailabilityStatus() {
		return availabilityStatus;
	}
	public void setAvailabilityStatus(String availabilityStatus) {
		this.availabilityStatus = availabilityStatus;
	}
}
