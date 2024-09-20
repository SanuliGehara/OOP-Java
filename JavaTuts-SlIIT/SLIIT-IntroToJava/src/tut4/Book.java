package tut4;

import java.util.Scanner;

public class Book implements IDisplay, IInput{
    int bookId;
    String title;
    String publisher;

    public void print() {
        System.out.println("\nBookId: "+ this.bookId + ",\tTitle: " +
                this.title + ",\tPublisher: " + this.publisher);
    }

    public void printDetails() {
        System.out.println("\nName: " + this.title);
        System.out.println("Id: " + this.bookId);
        System.out.println("Publisher: " +this.publisher);
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Book ID: ");
        int bookId = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Title: ");
        String title  = scanner.nextLine();

        System.out.print("Publisher: ");
        String publisher  = scanner.nextLine();

        this.bookId =bookId;
        this.title = title;
        this.publisher = publisher;
    }
}
