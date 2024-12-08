package com.example.Library;


public abstract class Book implements Lendable{
    private String isbn;
    private String title;
    private String author;
    private boolean isAvailable;
    private String type;

    public Book() {
        this.isAvailable = true;
    }

    public Book(String isbn, String title, String author, String type) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.type = type;
        this.isAvailable = true;
    }
    public Book(Book copy) {
        this.isbn = copy.isbn;
        this.title = copy.title;
        this.author = copy.author;
        this.type = copy.type;
    }

    @Override
    public boolean lend(User user) {
        if(isAvailable && user.canBorrowBooks()){
            isAvailable = false;
            user.borrowBook(this);            
            return true;
        }
        System.out.println("Book not return yet.");           
        return false;
    }

    @Override
    public void returnBook(User user) {
        if(!this.isAvailable) {
            isAvailable = true;
            user.returnBook(this); 
            return;
        } 
        System.out.println("Book not lent yet.");
    }

    @Override
    public boolean isAvailable() {
        return isAvailable;
    }

    public abstract void displayBookDetails();

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getType() {
        return type;
    }    
    
}
