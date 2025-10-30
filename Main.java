import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library lib = new Library();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Library Menu ---");
            System.out.println("1. Add Book");
            System.out.println("2. Register User");
            System.out.println("3. Show Books");
            System.out.println("4. Issue Book");
            System.out.println("5. Return Book");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Book title: ");
                    String title = sc.nextLine();
                    System.out.print("Author: ");
                    String author = sc.nextLine();
                    lib.addBook(title, author);
                    break;
                case 2:
                    System.out.print("User name: ");
                    String name = sc.nextLine();
                    System.out.print("User ID: ");
                    int id = sc.nextInt();
                    lib.registerUser(name, id);
                    break;
                case 3:
                    lib.showBooks();
                    break;
                case 4:
                    System.out.print("Book title to issue: ");
                    String issueTitle = sc.nextLine();
                    lib.issueBook(issueTitle);
                    break;
                case 5:
                    System.out.print("Book title to return: ");
                    String returnTitle = sc.nextLine();
                    lib.returnBook(returnTitle);
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 0);

        sc.close();
    }
}