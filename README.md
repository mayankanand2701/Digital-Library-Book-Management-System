# Digital-Library-Book-Management-System

The Digital Library Book Management System is a console-based Java application that enables librarians to efficiently manage book records, including adding, updating, searching, and removing books while maintaining their availability status. The system ensures that book records are handled properly with unique constraints and structured storage.

## Features

### 1. Add a Book
- Accepts Book ID, Title, Author, Genre, and Availability Status as input.
- Ensures Book ID is unique.
- Stores book details in an in-memory collection.

### 2. View All Books
- Displays a list of all books along with their details.

### 3. Search Book by ID or Title
- Enables searching for a book using Book ID or Title.

### 4. Update Book Details
- Allows modification of book details (e.g., change availability status, update title or author).

### 5. Delete a Book Record
- Removes a book from the catalog based on Book ID.

### 6. Exit System
- Provides an option to close the program.

## Constraints
- Book ID must be unique.
- Title and Author must be non-empty strings.
- Availability status must be either "Available" or "Checked Out".

## Assumptions
- The application is designed for a single-user environment (librarian usage).
- Books are stored in an in-memory collection (ArrayList) in this implementation.
- No database connectivity in the current version; data is lost upon restarting the application.

## Installation and Setup
### Prerequisites
- Ensure you have the following installed on your system :
  - Java JDK 8 or later
  - Git (for cloning the repository)
  - An IDE (Eclipse, IntelliJ IDEA, or VS Code with Java extension)

### Steps to Run the Program
#### 1.Clone the repository :

  ```javascript
  git clone https://github.com/mayankanand2701/Digital-Library-Book-Management-System.git
  ```

#### 2.Navigate to the project directory :

 ```javascript
  cd Digital-Library-Book-Management-System
  ```

#### 3.Compile and run the program :

```javascript
javac Main.java
java Main
  ```

#### 4.Follow the on-screen prompts to perform various book management operations.

## Testing
- Test Cases: More than 10+ unit test cases have been executed to ensure correctness.
- The program handles valid and invalid inputs correctly.
- Functionality such as adding, updating, searching, and deleting books has been tested rigorously.

## Challenges Faced
- Implementing unique constraints for Book ID required additional validation.
- Handling input validation to ensure Title and Author are non-empty.
- Brainstorming and implementing a scalable structure to ensure modularity.

## Future Improvements
If given more time, the following improvements would be made :
- Database Integration : Instead of storing book details in an in-memory collection, integrating MySQL or MongoDB to store book records persistently.
- REST API Support : Exposing book management functionalities as a RESTful API for external applications.
- User Authentication : Implementing a login system for different roles (e.g., Librarian, Member).
- GUI Interface : Enhancing the user experience by developing a GUI-based system using JavaFX or Swing.

## License
This project is licensed under the MIT License.
