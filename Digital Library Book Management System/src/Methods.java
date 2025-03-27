import java.util.ArrayList;
import java.util.Scanner;

public class Methods
{
	Scanner sc=new Scanner(System.in);
	
	// ArrayList to Store the value of various Books
	ArrayList<Book> books=new ArrayList<Book>();
	
	// Method to add Book in the Library
	public void addBook()
	{
		System.out.println("Enter Book Id of the Book which you want to add to the library : ");
		int id=sc.nextInt();
		sc.nextLine();
		
		// To validate for Constraint 1 
		if(checkBookId(id))
		{
			System.out.println("Book with Id "+id+" alredy exist in the Library! Try Again.");
			return;
		}
		
		System.out.println("Enter the Title of the Book :");
		String title=sc.nextLine();
		// To validate for Constraint 2
		if (title.isEmpty())
		{
			System.out.println("Title cannot be empty! Please enter a valid title for the Book.");
			return;
		}
		
		System.out.println("Enter the Author of the Book :");
		String author=sc.nextLine();
		// To validate for Constraint 2
		if (author.isEmpty())
		{
			System.out.println("Author cannot be empty! Please enter a valid Author for the Book.");
			return;
		}
		
		System.out.println("Enter the Genre of the Book :");
		String genre=sc.nextLine();
		System.out.println("Enter the Abailability Status of the Book (Available/Checked Out) :");
		String status=sc.nextLine();
		
		// To validate for Constraint 3
		if (!status.equalsIgnoreCase("Available") && !status.equalsIgnoreCase("Checked Out"))
		{
            System.out.println("Invalid Availability Status! Kindly enter Available/Checked Out .");
            return;
        }
		books.add(new Book(id, title, author, genre, status));
        System.out.println("Book with id "+id+" added successfully to the Library !");
	}
	
	// Helper Function to check if book with particular Id exist in the Library ( Constraint 1 )
	public boolean checkBookId(int id)
	{
		for(Book book:books)
		{
			if (book.getBookId()==id)return true;
		}
		return false;
	}
	
    // Method to display Book's from the Library
	public void displayBooks()
	{
		if (books.isEmpty()) System.out.println("No Books Available in the Library");
		else 
		{
			System.out.println("Details of all the Books in the Library are : ");
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
		sc.nextLine();
		
		if (choice==1)
		{
			System.out.println("Enter the Book Id which you want to search in the library : ");
			int id=sc.nextInt();
			if(checkBookId(id))
			{
				System.out.println("Book with id "+id+" exist in the Library! Book Found.");
				return;
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
		System.out.println("Enter the Book Id whose details you want to update from Library : ");
		int id=sc.nextInt();
		sc.nextLine();
		for(Book book : books)
		{
			if(book.getBookId()==id)
			{
				System.out.println("Enter new Title of the Book (leave blank for no update) : ");
                String newTitle = sc.nextLine();
                if (!newTitle.isEmpty()) book.setTitle(newTitle);

                System.out.println("Enter new Author of the Book (leave blank for no update) : ");
                String newAuthor = sc.nextLine();
                if (!newAuthor.isEmpty()) book.setAuthor(newAuthor);

                System.out.println("Enter new Genre of the Book (leave blank for no update) : ");
                String newGenre = sc.nextLine();
                if (!newGenre.isEmpty()) book.setGenre(newGenre);

                System.out.println("Enter new Availability Status of the Book (Available/Checked Out) : ");
                String newAvailability = sc.nextLine();
                
                // To validate for Constraint 3
                if (newAvailability.equalsIgnoreCase("Available") || newAvailability.equalsIgnoreCase("Checked Out")) book.setAvailabilityStatus(newAvailability);
				
				System.out.println("Book with id "+id+" updated successfully!");
                return;
			}
		}
		System.out.println("Book with id "+id+" doesn't exist in the Library! Updation Failed.");
	}
	
	// Method to delete the book by it id from the Library
	public void deleteBook()
	{
		System.out.println("Enter the Book Id of the Book which you want to delete from Library : ");
		int id=sc.nextInt();
		sc.nextLine();
		for(Book book:books)
		{
			if (book.getBookId()==id)
			{
				books.remove(book);
				System.out.println("Book with id "+id+" sucessfully deleted from Library!");
				return;
			}
		}
		System.out.println("Book with id "+id+" doesn't exist in the Library! Deletion Unsuccessfull.");
	}
}
