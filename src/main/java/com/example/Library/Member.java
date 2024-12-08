package com.example.Library;

import java.util.ArrayList;
import java.util.List;

public class Member extends User {
    private int borrowedBooksCount;
    private List<Book> borrowedBooks;
    private static final int MAX_BORROW_LIMIT = 5;

    public Member () {
        super();
        this.borrowedBooksCount = 0;
        this.borrowedBooks = new ArrayList<>();
    }

    public Member(String name, String contactInfo) {
        super(name, contactInfo);
        this.borrowedBooksCount = 0;
        this.borrowedBooks = new ArrayList<>();
    }

    @Override
    public void displayDashboard() {
        System.out.println("Member "+this.getName()+" Dashboard");
        System.out.println("Books Borrowed:"+ this.borrowedBooksCount);
        System.out.println("------------");
        for (Book book : borrowedBooks) {
            book.displayBookDetails();
        }
        System.out.println("------------");
    }

    @Override
    public boolean canBorrowBooks() {
        return(borrowedBooksCount < MAX_BORROW_LIMIT);
    }

    @Override
    public void returnBook(Book book) {
        borrowedBooksCount--;
        borrowedBooks.remove(book);
        System.out.println("Book:"+book.getIsbn()+" returned by User:"+this.getName()); 
    }

    @Override
    public void borrowBook(Book book) {
        borrowedBooksCount++;
        borrowedBooks.add(book);
        System.out.println("Book:"+book.getIsbn()+" lent to User:"+this.getName());
    }

    @Override
    public void userInfo() {
        System.out.println("User:"+this.getUserId()+" Name:"+this.getName());
    }
    

    public int getBorrowedBooksCount() {
        return borrowedBooksCount;
    }
    
}
