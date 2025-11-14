import java.util.Scanner;

class Book {

    // Data members
    private String name;
    private String author;
    private double price;
    private int num_pages;

    // Constructor
    public Book(String name, String author, double price, int num_pages) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.num_pages = num_pages;
    }

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setNumPages(int num_pages) {
        this.num_pages = num_pages;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public int getNumPages() {
        return num_pages;
    }

    // toString() method — Displays object details as String
    public String toString() {
        return "Book Name: " + name +
               "\nAuthor: " + author +
               "\nPrice: Rs." + price +
               "\nNumber of Pages: " + num_pages;
    }
}

public class BookDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter Book Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Author Name: ");
        String author = sc.nextLine();

        System.out.print("Enter Book Price: ");
        double price = sc.nextDouble();

        System.out.print("Enter Number of Pages: ");
        int pages = sc.nextInt();

        // Creating Book object
        Book b = new Book(name, author, price, pages);

        // Displaying Book Details
        System.out.println("\nBook Details:");
        System.out.println(b.toString());

        sc.close();
    }
}
