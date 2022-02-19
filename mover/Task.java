package mover;

public class Task {
    public static void main(String[] args) {
        Book book = new Book("The Lord of the Rings");
        BookMover bookMoverAvailable = new FromAvailableStatusMover();
        bookMoverAvailable.moveToStatus(book, Status.BORROWED);
        System.out.println("Статус вашей книги: " + book.getStatus());
        BookMover bookMoverArchived = new FromArchivedStatusMover();
        bookMoverArchived.moveToStatus(book, Status.BORROWED);
    }
}
