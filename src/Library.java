import java.util.ArrayList;

public class Library {
    private ArrayList<LibraryItem> items;

    public Library() {
        items = new ArrayList<>();
    }

    public void addItem(LibraryItem item) {
        items.add(item);
    }

    public void removeItem(String itemID) {
        items.removeIf(item -> item.getItemID().equals(itemID));
    }

    public void displayAllItems() {
        for (LibraryItem item : items) {
            item.displayDetails();
            System.out.println();
        }
    }
}
