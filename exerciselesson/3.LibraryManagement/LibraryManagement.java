import java.util.*;
import java.sql.*;

public class LibraryManagement{

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            System.out.println("\n===== Library Management System (MySQL) =====");
            System.out.println("1. Add Book");
            System.out.println("2. Read Books");
            System.out.println("3. Update Book");
            System.out.println("4. Delete Book");
            System.out.println("5. Borrow Book");
            System.out.println("6. Return Book");
            System.out.println("0. Exit Program\n");
            System.out.print("Enter your option = ");

            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    createBook(scanner);
                    break;
                case 2:
                    readBooks();
                    break;
                case 3:
                    updateBook(scanner);
                    break;
                case 4:
                    deleteBook(scanner);
                    break;
                case 5:
                    borrowBook(scanner);
                    break;
                case 6:
                    returnBook(scanner);
                    break;
                case 0:
                    System.out.println("Exit Program.");
                    break;
                default:
                    System.out.println("Invalid Number.");
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

        String sql = "INSERT INTO books(title, author, category, is_borrowed, borrower_name) VALUES (?, ?, ?, 0, '-')";

        try (
                Connection con = DBConnection.getConnection();
                PreparedStatement ps = con.prepareStatement(sql)
        ) {
            ps.setString(1, title);
            ps.setString(2, author);
            ps.setString(3, category);

            ps.executeUpdate();
            System.out.println("Book Created Successfully.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 2. Read Books
    private static void readBooks() {
        String sql = "SELECT * FROM books ORDER BY id ASC";

        try (
                Connection con = DBConnection.getConnection();
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery(sql)
        ) {
            System.out.println("\n===== Book List =====");
            while (rs.next()) {
                int id = rs.getInt("id");
                String title = rs.getString("title");
                String author = rs.getString("author");
                String category = rs.getString("category");
                int isBorrowed = rs.getInt("is_borrowed");
                String borrowerName = rs.getString("borrower_name");

                String status = (isBorrowed == 1)
                        ? "Borrowed (" + borrowerName + ")"
                        : "Available";

                System.out.println(
                        "ID: " + id +
                                " | Title: " + title +
                                " | Author: " + author +
                                " | Category: " + category +
                                " | Status: " + status
                );
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 3. Update Book
    private static void updateBook(Scanner scanner) {
        System.out.print("Enter book id to update = ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter new title = ");
        String title = scanner.nextLine();

        System.out.print("Enter new author = ");
        String author = scanner.nextLine();

        System.out.print("Enter new category = ");
        String category = scanner.nextLine();

        String sql = "UPDATE books SET title = ?, author = ?, category = ? WHERE id = ?";

        try (
                Connection con = DBConnection.getConnection();
                PreparedStatement ps = con.prepareStatement(sql)
        ) {
            ps.setString(1, title);
            ps.setString(2, author);
            ps.setString(3, category);
            ps.setInt(4, id);

            int result = ps.executeUpdate();

            if (result > 0) {
                System.out.println("Book Updated Successfully.");
            } else {
                System.out.println("Book Not Found");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 4. Delete Book
    private static void deleteBook(Scanner scanner) {
        System.out.print("Enter book id to delete = ");
        int id = scanner.nextInt();
        scanner.nextLine();

        String sql = "DELETE FROM books WHERE id = ?";

        try (
                Connection con = DBConnection.getConnection();
                PreparedStatement ps = con.prepareStatement(sql)
        ) {
            ps.setInt(1, id);

            int result = ps.executeUpdate();

            if (result > 0) {
                System.out.println("Book Deleted Successfully.");
            } else {
                System.out.println("Book Not Found");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // helper: check book status
    private static Integer getBorrowStatus(Connection con, int id) throws SQLException {
        String sql = "SELECT is_borrowed FROM books WHERE id = ?";
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, id);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) return rs.getInt("is_borrowed");
                return null; // book not found
            }
        }
    }

    // 5. Borrow Book
    private static void borrowBook(Scanner scanner) {
        System.out.print("Enter book id to borrow = ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter borrower name = ");
        String borrower = scanner.nextLine();

        String sql = "UPDATE books SET is_borrowed = 1, borrower_name = ? WHERE id = ?";

        try (Connection con = DBConnection.getConnection()) {

            Integer status = getBorrowStatus(con, id);
            if (status == null) {
                System.out.println("Book Not Found");
                return;
            }
            if (status == 1) {
                System.out.println("This book is already borrowed.");
                return;
            }

            try (PreparedStatement ps = con.prepareStatement(sql)) {
                ps.setString(1, borrower);
                ps.setInt(2, id);

                int result = ps.executeUpdate();
                if (result > 0) {
                    System.out.println("Book Borrowed Successfully.");
                } else {
                    System.out.println("Book Not Found");
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 6. Return Book
    private static void returnBook(Scanner scanner) {
        System.out.print("Enter book id to return = ");
        int id = scanner.nextInt();
        scanner.nextLine();

        String sql = "UPDATE books SET is_borrowed = 0, borrower_name = '-' WHERE id = ?";

        try (Connection con = DBConnection.getConnection()) {

            Integer status = getBorrowStatus(con, id);
            if (status == null) {
                System.out.println("Book Not Found");
                return;
            }
            if (status == 0) {
                System.out.println("This book is already available (not borrowed).");
                return;
            }

            try (PreparedStatement ps = con.prepareStatement(sql)) {
                ps.setInt(1, id);
                int result = ps.executeUpdate();

                if (result > 0) {
                    System.out.println("Book Returned Successfully.");
                } else {
                    System.out.println("Book Not Found");
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

// java run 
// javac -cp ".;mysql-connector-j-9.5.0.jar" *.java
// java  -cp ".;mysql-connector-j-9.5.0.jar" LibraryManagement


