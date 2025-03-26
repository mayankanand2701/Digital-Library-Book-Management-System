import java.util.ArrayList;
import java.util.Scanner;

public class Methods
{
	Scanner sc=new Scanner(System.in);
	ArrayList<Book> books=new ArrayList<Book>();
	
	// Method to add Book in the Library
	public void addBook()
	{
		
	}
	
    // Method to display Book's from the Library
	public void displayBooks()
	{
		if (books.isEmpty()) System.out.println("No Books Available in the Library");
		else 
		{
			for(Book book:books) System.out.println(book);
		}
	}
	
	// Method to search a  Book in the Library
	public void searchBook()
	{
		System.out.println("Enter 1 to search Book by Id");
		System.out.println("Enter 2 to search Book by Title");
		System.out.println("Enter your choice : ");
		int choice=sc.nextInt();
		if (choice==1)
		{
			System.out.println("Enter the Book Id which you want to search in the library : ");
			int id=sc.nextInt();
			for(Book book:books)
			{
				if(book.getBookId()==id)
				{
					System.out.println("Book with id "+id+" exist in the Library! Book Found.");
					return;
				}
			}
			System.out.println("Book with id "+id+" does not exist in the Library! Book Not Found.");
		}
		else if(choice==2)
		{
			System.out.println("Enter the Title of the Book which you want to search in the library : ");
			String title=sc.nextLine();
			for(Book book:books)
			{
				if(book.getTitle().equalsIgnoreCase(title))
				{
					System.out.println("Book with Title "+title+" exist in the Library! Book Found.");
					return;
				}
			}
			System.out.println("Book with Title "+title+" does not exist in the Library! Book Not Found.");
		}
		else System.out.println("Invalid Option Opted! Book Not Found. ");
	}
	
	// Method to update the details of the  Book in the Library
	public void updateBook()
	{
		
	}
	
	// Method to delete the book by it id from the Library
	public void deleteBook()
	{
		System.out.println("Enter the Book Id of the Book which you want to delete from Library : ");
		int id=sc.nextInt();
		for(Book book:books)
		{
			if (book.getBookId()==id)
			{
				books.remove(book);
				System.out.println("Book with id "+id+" sucessfully deleted from Library!");
				return;
			}
		}
		System.out.println("Book with id "+id+" doesn't exist in the Library");
	}
}
