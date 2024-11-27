public class Book extends LibraryItem {
    private int numberOfPages;
    private String publisher;

    public Book(String title, String author, String itemID, int numberOfPages, String publisher) {
        super(title, author, itemID);
        this.numberOfPages = numberOfPages;
        this.publisher = publisher;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Number of Pages: " + numberOfPages);
        System.out.println("Publisher: " + publisher);
    }

    // Getters and setters for each attribute
    public int getNumberOfPages() { return numberOfPages; }
    public void setNumberOfPages(int numberOfPages) { this.numberOfPages = numberOfPages; }

    public String getPublisher() { return publisher; }
    public void setPublisher(String publisher) { this.publisher = publisher; }
}
