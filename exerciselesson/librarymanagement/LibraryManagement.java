import java.util.ArrayList;
import java.util.Scanner;

public class LibraryManagement {

    static ArrayList<Book> books = new ArrayList<>();
    static int bookIdCounter = 1;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            System.out.println("\n===== Library Management System =====");
            System.out.println("1. Create Book");
            System.out.println("2. Read Books");
            System.out.println("3. Update Book by ID");
            System.out.println("4. Delete Book by ID");
            System.out.println("5. Borrow Book by ID");
            System.out.println("6. Return Book by ID");
            System.out.println("0. Exit");
            System.out.print("Enter option = ");

            option = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (option) {
                case 1:
                    createBook(scanner);
                    break;
                case 2:
                    readBooks();
                    break;
                case 3:
                    updateBookById(scanner);
                    break;
                case 4:
                    deleteBookById(scanner);
                    break;
                case 5:
                    borrowBookById(scanner);
                    break;
                case 6:
                    returnBookById(scanner);
                    break;
                case 0:
                    System.out.println("Exit Program.");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }

        } while (option != 0);

        scanner.close();
    }

    // 1. Create Book
    private static void createBook(Scanner scanner) {
        System.out.print("Enter Title = ");
        String title = scanner.nextLine();

        System.out.print("Enter Author = ");
        String author = scanner.nextLine();

        System.out.print("Enter Category = ");
        String category = scanner.nextLine();

        Book book = new Book(bookIdCounter++, title, author, category);
        books.add(book);

        System.out.println("Book created successfully!");
    }

    // 2. Read Books
    private static void readBooks() {
        if (books.isEmpty()) {
            System.out.println("No books found.");
        } else {
            System.out.println("===== List of Books =====");
            for (Book book : books) {
                System.out.println(book);
            }
        }
    }

    // helper: find book by ID
    private static Book findBookById(int id) {
        for (Book book : books) {
            if (book.id == id) {
                return book;
            }
        }
        return null;
    }

    // 3. Update Book by ID
    private static void updateBookById(Scanner scanner) {
        System.out.print("Enter Book ID to update = ");
        int id = scanner.nextInt();
        scanner.nextLine();

        Book bookToUpdate = findBookById(id);

        if (bookToUpdate == null) {
            System.out.println("Book with ID = " + id + " not found.");
            return;
        }

        System.out.print("Enter new Title (press Enter to skip) = ");
        String newTitle = scanner.nextLine();
        if (!newTitle.isEmpty()) {
            bookToUpdate.title = newTitle;
        }

        System.out.print("Enter new Author (press Enter to skip) = ");
        String newAuthor = scanner.nextLine();
        if (!newAuthor.isEmpty()) {
            bookToUpdate.author = newAuthor;
        }

        System.out.print("Enter new Category (press Enter to skip) = ");
        String newCategory = scanner.nextLine();
        if (!newCategory.isEmpty()) {
            bookToUpdate.category = newCategory;
        }

        System.out.println("Book updated successfully!");
    }

    // 4. Delete Book by ID
    private static void deleteBookById(Scanner scanner) {
        System.out.print("Enter Book ID to delete = ");
        int id = scanner.nextInt();
        scanner.nextLine();

        Book bookToDelete = findBookById(id);

        if (bookToDelete == null) {
            System.out.println("Book with ID = " + id + " not found.");
        } else {
            books.remove(bookToDelete);
            System.out.println("Book deleted successfully!");
        }
    }

    // 5. Borrow Book by ID
    private static void borrowBookById(Scanner scanner) {
        System.out.print("Enter Book ID to borrow = ");
        int id = scanner.nextInt();
        scanner.nextLine();

        Book book = findBookById(id);

        if (book == null) {
            System.out.println("Book with ID = " + id + " not found.");
            return;
        }

        if (book.isBorrowed) {
            System.out.println("This book is already borrowed by: " + book.borrowerName);
            return;
        }

        System.out.print("Enter Borrower Name = ");
        String borrower = scanner.nextLine();

        book.isBorrowed = true;
        book.borrowerName = borrower;

        System.out.println("Book borrowed successfully!");
    }

    // 6. Return Book by ID
    private static void returnBookById(Scanner scanner) {
        System.out.print("Enter Book ID to return = ");
        int id = scanner.nextInt();
        scanner.nextLine();

        Book book = findBookById(id);

        if (book == null) {
            System.out.println("Book with ID = " + id + " not found.");
            return;
        }

        if (!book.isBorrowed) {
            System.out.println("This book is already available (not borrowed).");
            return;
        }

        book.isBorrowed = false;
        book.borrowerName = "-";

        System.out.println("Book returned successfully!");
    }
}
