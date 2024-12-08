package com.example;

import com.example.Library.Book;
import com.example.Library.Librarian;
import com.example.Library.LibraryManagementSystem;
import com.example.Library.Member;
import com.example.Library.NovelBook;
import com.example.Library.TextBook;
import com.example.Library.User;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        LibraryManagementSystem l = new LibraryManagementSystem();
        l.addBook(new TextBook("123","TextBook Title 1","Author 1","Subject 1",2001));
        l.addBook(new TextBook("124","TextBook Title 2","Author 1","Subject 2",2002));
        l.addBook(new TextBook("125","TextBook Title 3","Author 2","Subject 3",2003));
        l.addBook(new NovelBook("221","NovelBook Title 21","Author 21","Comedy"));
        l.addBook(new NovelBook("222","NovelBook Title 22","Author 22","Horror"));
        l.addBook(new NovelBook("223","NovelBook Title 23","Author 23","Sci-Fi"));

        l.registerUser(new Member("Member Name1", "9090909090"));
        l.registerUser(new Member("Member Name2", "9090909091"));
        l.registerUser(new Member("Member Name3", "9090909092"));
        l.registerUser(new Member("Member Name4", "9090909093"));
        l.registerUser(new Member("Member Name5", "9090909094"));

        l.registerUser(new Librarian("Librarian Name11", "9190909090", "EMP-101"));
        l.registerUser(new Librarian("Librarian Name12", "9190909091", "EMP-102"));
        l.registerUser(new Librarian("Librarian Name13", "9190909092", "EMP-103"));

        System.out.println(">>Lending Book:"+l.getBookInventory().get(0).lend(l.getRegisteredUsers().get(0)));
        System.out.println(">>Lending Book:"+l.getBookInventory().get(0).lend(l.getRegisteredUsers().get(1)));
        System.out.println(">>Lending Book:"+l.getBookInventory().get(1).lend(l.getRegisteredUsers().get(0)));
        System.out.println(">>Lending Book:"+l.getBookInventory().get(2).lend(l.getRegisteredUsers().get(0)));
        System.out.println(">>Lending Book:"+l.getBookInventory().get(3).lend(l.getRegisteredUsers().get(0)));
        System.out.println(">>Lending Book:"+l.getBookInventory().get(4).lend(l.getRegisteredUsers().get(0)));
        System.out.println(">>Lending Book:"+l.getBookInventory().get(5).lend(l.getRegisteredUsers().get(0)));

        l.getBookInventory().get(4).returnBook(l.getRegisteredUsers().get(0));
        System.out.println(">>Lending Book:"+l.getBookInventory().get(5).lend(l.getRegisteredUsers().get(0)));

        for (Book book : l.getBookInventory()) {
            book.displayBookDetails();
        }

        for (User user : l.getRegisteredUsers()) {
            user.userInfo();
        }
        System.out.println("Search--------------");
        for (Book book : l.searchBooks("Title 1")) {
            book.displayBookDetails();
        };
        System.out.println("Search--------------");
        for (Book book : l.searchBooks("Author 1")) {
            book.displayBookDetails();
        };
        System.out.println("Search--------------");
        for (Book book : l.searchBooks("Author 21","NovelBook")) {
            book.displayBookDetails();
        };        
    }
}
