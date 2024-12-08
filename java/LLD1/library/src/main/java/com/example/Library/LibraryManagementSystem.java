package com.example.Library;

import java.util.ArrayList;
import java.util.List;

public class LibraryManagementSystem  {
    private List<Book> bookInventory;
    private List<User> registeredUsers;

    public LibraryManagementSystem() {
        bookInventory = new ArrayList<>();
        registeredUsers = new ArrayList<>();
    }

    public void addBook(Book book) {
        bookInventory.add(book);
        System.out.println("Book added to Library:"+book.getIsbn()+" "+book.getTitle());
    }

    public void registerUser(User user) {
        registeredUsers.add(user);
        System.out.println("User registered to Library:"+user.getName());
    }

    public List<Book> getBookInventory() {
        return bookInventory;
    }

    public List<User> getRegisteredUsers() {
        return registeredUsers;
    }
    
    public List<Book> searchBooks(String criteria) {
        List<Book> result = new ArrayList<>();
        for (Book book : bookInventory) {
            if(criteria.equalsIgnoreCase(book.getTitle()) || criteria.equalsIgnoreCase(book.getAuthor())) {
                result.add(book);
            }
        }
        return result;
    }

    public List<Book> searchBooks(String criteria, String type) {
        List<Book> result = new ArrayList<>();
        for (Book book : bookInventory) {
            if(book.getType().equalsIgnoreCase(type)) {
                if(criteria.equalsIgnoreCase(book.getTitle()) || criteria.equalsIgnoreCase(book.getAuthor())) {
                    result.add(book);
                }
            }
        }
        return result;
    }
}
