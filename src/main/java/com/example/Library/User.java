package com.example.Library;

public abstract class User {
    private String userId;
    private String name;
    private String contactInfo;
    private static int totalUsers = 0;

    public User() {
        this.userId = generateUniqueId();
    }

    public User(String name, String contactInfo) {
        this.userId = generateUniqueId();
        this.name = name;
        this.contactInfo = contactInfo;
    }

    public User(User copy) {
        this.userId = generateUniqueId();
        this.name = copy.name;
        this.contactInfo = copy.contactInfo;
    }

    public String getUserId() {
        return userId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getContactInfo() {
        return contactInfo;
    }
    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    private final String generateUniqueId() {
        return "User-"+ ++totalUsers;
    }

    public abstract void displayDashboard();

    public abstract boolean canBorrowBooks();

    public abstract void returnBook(Book book);

    public abstract void borrowBook(Book book);

    public abstract void userInfo();    
}
