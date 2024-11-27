import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "B001", 180, "Scribner");
        Journal journal1 = new Journal("Science Journal", "John Doe", "J001", 15,new Date());

        library.addItem(book1);
        library.addItem(journal1);

        System.out.println("Library Items:");
        library.displayAllItems();

        library.removeItem("B001");

        System.out.println("Library Items after removing book:");
        library.displayAllItems();
    }
}
