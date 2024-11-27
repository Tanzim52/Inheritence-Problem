public class LibraryItem {
    private String title;
    private String author;
    private String itemID;

    public LibraryItem(String title, String author, String itemID) {
        this.title = title;
        this.author = author;
        this.itemID = itemID;
    }

    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Item ID: " + itemID);
    }

    // Getters and setters for each attribute
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }

    public String getItemID() { return itemID; }
    public void setItemID(String itemID) { this.itemID = itemID; }
}
