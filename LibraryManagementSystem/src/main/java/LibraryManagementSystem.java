/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author drggf
 */
class ISBN {
    private String isbn;

    // Constructor
    public ISBN(String isbn) {
        this.isbn = isbn;
    }

    // Setter for ISBN
    public void setISBN(String isbn) {
        this.isbn = isbn;
    }

    // Getter for ISBN
    public String getISBN() {
        return this.isbn;
    }
}

// Book Class
class Book {
    private String title;
    private String author;
    private String publisher;
    private String cityOfPublication;
    private String dateOfPublication;
    private double price;
    private ISBN isbnNum;

    // Constructor
    public Book(String title, String author, String publisher, String city, String date, double price, ISBN isbn) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.cityOfPublication = city;
        this.dateOfPublication = date;
        this.price = price;
        this.isbnNum = isbn;
    }

    // Method to set the book's ISBN
    public void setBookISBN(ISBN isbn) {
        this.isbnNum = isbn;
    }

    // Method to return the book's author
    public String getAuthor() {
        return this.author;
    }

    // Method to get the ISBN of the book
    public String getBookISBN() {
        return this.isbnNum.getISBN();
    }

    // Method to print the book's details
    public void printDetails() {
        System.out.println("Book Title: " + this.title);
        System.out.println("Book Author: " + this.author);
        System.out.println("Publisher: " + this.publisher);
        System.out.println("City of Publication: " + this.cityOfPublication);
        System.out.println("Date of Publication: " + this.dateOfPublication);
        System.out.println("Price: $" + this.price);
        System.out.println("ISBN: " + this.isbnNum.getISBN());
    }
}

// Main Class to Test
public class LibraryManagementSystem {
    public static void main(String[] args) {
        // Create an ISBN object
        ISBN bookISBN = new ISBN("0 941831 39 6");

        // Create a Book object
        Book book = new Book(
            "Object-oriented Programming with Java",
            "David j. Barnes and Michael Kolling",
            "Prentice Hall",
            "New York",
            "2005",
            59.99,
            bookISBN
        );

        // Print the book's details
        book.printDetails();
    }
}

