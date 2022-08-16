package com.jap.book;
public class BookStoreImpl {
    public static void main(String[] args) {
        Author Auth =new Author();
        Auth.setAuthorName("Chetan");
        Auth.setAuthorPenName("Bhagat");
        Book Book=new Book();
        Book[] arr =new Book[1];
        arr[0]=Book;
        Book.setBookName("Geeta");
        Book.setGenre("Fiction");
        Book.setISBNNo(4654768);
        Book.setPrice(2000);
        Book.setAuthor(Auth);


        Book.displayBookDetails();

    }
}


