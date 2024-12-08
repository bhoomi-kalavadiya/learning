package com.example.Library;

import main.java.com.example.Library.BookType;

public class NovelBook extends Book {
    private String genre;

    public NovelBook() {
        super();
    }

    public NovelBook(String isbn, String title, String author, String genre) {
        super(isbn, title, author, "NovelBook");
        this.genre = genre;
    }

    @Override
    public void displayBookDetails() {
        System.out.println("Book["+" ISBN:"+this.getIsbn()+" Title:"+this.getTitle()+" Auther:"+this.getAuthor()+" isAvailable:"+this.isAvailable()+" ]");
    }
    
}
