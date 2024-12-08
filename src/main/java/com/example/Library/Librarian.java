package com.example.Library;

public class Librarian extends User {
    private String employeeNumber;    

    public Librarian() {
        super();
    }

    public Librarian(String name, String contactInfo) {
        super(name, contactInfo);
    }

    public Librarian(String name, String contactInfo, String employeeNumber) {
        super(name, contactInfo);
        this.employeeNumber = employeeNumber;
    }

    @Override
    public void displayDashboard() {
        System.out.println("Librarian "+this.getName()+" Dashboard");
        System.out.println("Employee Number:"+ this.employeeNumber);
    }

    @Override
    public boolean canBorrowBooks() {
        return true;
    }

    @Override
    public void borrowBook(Book book) {}

    @Override
    public void returnBook(Book book) {
    }

    @Override
    public void userInfo() {
        System.out.println("User:"+this.getUserId()+" EmpId:"+this.getEmployeeNumber()+" Name:"+this.getName());
    }

    public String getEmployeeNumber() {
        return employeeNumber;
    }
}
