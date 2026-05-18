import java.util.Scanner;

class Library
{
    String bookName;
    String authorName;
    int bookId;

    void addBook()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Book ID:");
        bookId = sc.nextInt();

        sc.nextLine();

        System.out.println("Enter Book Name:");
        bookName = sc.nextLine();

        System.out.println("Enter Author Name:");
        authorName = sc.nextLine();
    }

    void displayBook()
    {
        System.out.println("Book ID: " + bookId);
        System.out.println("Book Name: " + bookName);
        System.out.println("Author Name: " + authorName);
    }

    public static void main(String args[])
    {
        Library l = new Library();

        l.addBook();

        l.displayBook();
    }
}
