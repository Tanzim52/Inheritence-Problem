import java.util.Date;

public class Journal extends LibraryItem {
    private int volumeNumber;
    private Date publicationDate;

    public Journal(String title, String author, String itemID, int volumeNumber, Date publicationDate) {
        super(title, author, itemID);
        this.volumeNumber = volumeNumber;
        this.publicationDate = publicationDate;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Volume Number: " + volumeNumber);
        System.out.println("Publication Date: " + publicationDate);
    }

    // Getters and setters for each attribute
    public int getVolumeNumber() { return volumeNumber; }
    public void setVolumeNumber(int volumeNumber) { this.volumeNumber = volumeNumber; }

    public Date getPublicationDate() { return publicationDate; }
    public void setPublicationDate(Date publicationDate) { this.publicationDate = publicationDate; }
}
