import java.util.Scanner;
public class Main
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		// Creating Object to call the various methods present inside Method Class
		Methods library=new Methods();
		
		System.out.println("-------------------------------------------------");
		System.out.println("Welcome to Digital Library Book Management System");
		System.out.println("-------------------------------------------------");
		while(true)
		{
			System.out.println("-------------------------------------------------");
			System.out.println("Enter 1 to Add a Book to the Library.");
			System.out.println("Enter 2 to Display all the Book's in the Library.");
			System.out.println("Enter 3 to Search a Book by Id or Title.");
			System.out.println("Enter 4 to Update a Book in the Library.");
			System.out.println("Enter 5 to Delete a Book to the Library.");
			System.out.println("Enter 6 to Exit.");
			System.out.println("Enter Your Choice : ");
			int choice=sc.nextInt();
			sc.nextLine();
			System.out.println("-------------------------------------------------");
			
			switch(choice)
			{
			case 1: 
				library.addBook();
				break;
			case 2: 
				library.displayBooks();
				break;
			case 3: 
				library.searchBook();
				break;
			case 4: 
				library.updateBook();
				break;
			case 5: 
				library.deleteBook();
				break;
			case 6: 
				System.out.println("Thank You! Kinldy run the program again to mange Book's");
				sc.close();
				System.exit(0);
			default: 
				System.out.println("Invalid Choice! Try Again.");
			}
		}
	}
}
