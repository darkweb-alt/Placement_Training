import java.util.ArrayList;

abstract class LibraryItem {
    String title;
    int itemId;
    boolean isAvailable;

    LibraryItem(String title, int itemId) {
        this.title = title;
        this.itemId = itemId;
        this.isAvailable = true;
    }

    abstract int getLoanPeriod();

    void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Item ID: " + itemId);
        System.out.println("Available: " + isAvailable);
        System.out.println("Loan Period: " + getLoanPeriod() + " days");
        System.out.println();
    }
}

interface Borrowable {
    void borrowItem();
    void returnItem();
}

class Book extends LibraryItem implements Borrowable {

    Book(String title, int itemId) {
        super(title, itemId);
    }

    int getLoanPeriod() {
        return 14;
    }

    public void borrowItem() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println(title + " borrowed successfully");
        } else {
            System.out.println(title + " is not available");
        }
    }

    public void returnItem() {
        isAvailable = true;
        System.out.println(title + " returned successfully");
    }
}

class Magazine extends LibraryItem {

    Magazine(String title, int itemId) {
        super(title, itemId);
    }

    int getLoanPeriod() {
        return 0;
    }
}

class DVD extends LibraryItem implements Borrowable {

    DVD(String title, int itemId) {
        super(title, itemId);
    }

    int getLoanPeriod() {
        return 7;
    }

    public void borrowItem() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println(title + " borrowed successfully");
        } else {
            System.out.println(title + " is not available");
        }
    }

    public void returnItem() {
        isAvailable = true;
        System.out.println(title + " returned successfully");
    }
}

class Librarian {
    ArrayList<LibraryItem> items = new ArrayList<>();

    void addItem(LibraryItem item) {
        items.add(item);
    }

    void displayItems() {
        for (LibraryItem item : items) {
            item.displayDetails();
        }
    }
}

public class LibraryManagement {
    public static void main(String[] args) {

        Book book = new Book("Java Programming", 101);
        Magazine magazine = new Magazine("Tech Today", 102);
        DVD dvd = new DVD("Java Tutorial", 103);

        Librarian librarian = new Librarian();

        librarian.addItem(book);
        librarian.addItem(magazine);
        librarian.addItem(dvd);

        librarian.displayItems();

        book.borrowItem();
        dvd.borrowItem();

        System.out.println();

        System.out.println("Attempting to borrow Magazine:");
        System.out.println("Magazine cannot be borrowed");

        System.out.println();

        book.returnItem();
        dvd.returnItem();
    }
}