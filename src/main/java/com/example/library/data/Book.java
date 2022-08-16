package com.jap.book;
public class Book {
    // Implement data hiding by declaring member variables private
    private int ISBNNo;
    private String bookName;
    private Author author;
    public int getISBNNo() {
        return ISBNNo;
    }
    public void setISBNNo(int ISBNNo) {
        this.ISBNNo = ISBNNo;
    }
    public String getBookName() {
        return bookName;
    }
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
    public Author getAuthor() {
        return author;
    }
    public void setAuthor(Author author) {
        this.author = author;
    }
    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    private String genre;
    private float price;
        // Declare getter and setter methods
    // Method to display the details of a book
    public String displayBookDetails()
    { System.out.println("ISBNNO: "+ISBNNo);
        System.out.println("BookName: "+bookName);
        System.out.println("Author: "+author.getAuthorName());
        System.out.println("Genre: "+genre);
        System.out.println("Price: "+price);


        return (ISBNNo+"::"+bookName+"::"+author.getAuthorName()+"::"+genre+"::"+" $"+price);
    }
}
