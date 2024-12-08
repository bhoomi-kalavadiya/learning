package com.example.Library;

public class TextBook extends Book {
    private String subject;
    private int edition;
    
    public TextBook(){
        super();
    }

    public TextBook(String isbn, String title, String author, String subject, int edition) {
        super(isbn, title, author,"TextBook");
        this.subject = subject;
        this.edition = edition;
    }

    @Override
    public void displayBookDetails() {
        System.out.println("Book["+" ISBN:"+this.getIsbn()+" Title:"+this.getTitle()+" Auther:"+this.getAuthor()+" Subject:"+this.subject+" Edition:"+this.edition+" Type:"+this.getType()+" isAvailable:"+this.isAvailable()+" ]");
    }

    public String getSubject() {
        return subject;
    }

    public int getEdition() {
        return edition;
    }

}
