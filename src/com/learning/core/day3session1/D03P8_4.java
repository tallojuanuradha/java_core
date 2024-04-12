package com.learning.core.day3session1;

import java.util.*;

class Book1 implements Comparable<Book> {
    private int bookId;
    private String title;
    private double price;
    private String publicationDate;
    private String author;

    public Book1(int bookId, String title, double price, String publicationDate, String author) {
        this.bookId = bookId;
        this.title = title;
        this.price = price;
        this.publicationDate = publicationDate;
        this.author = author;
    }

    // Getters and setters

    @Override
    public String toString() {
        return bookId + " " + title + "\n" +
                price + " " + author + "\n" +
                publicationDate + "\n";
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookId, title, price, publicationDate, author);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Book book = (Book) obj;
        return bookId == book.getBookId() &&
                Double.compare(book.getPrice(), price) == 0 &&
                Objects.equals(title, book.getTitle()) &&
                Objects.equals(publicationDate, book.publicationDate) &&
                Objects.equals(author, book.getAuthor());
    }

    @Override
    public int compareTo(Book other) {
        return this.author.compareTo(other.getAuthor());
    }
}

public class D03P8_4 {
    public static void main(String[] args) {
        TreeSet<Book> books = new TreeSet<>();

        books.add(new Book(1003, "Java Programming", 523.0, "23/11/1984", "Gilad Bracha"));
        books.add(new Book(1004, "Read C++", 295.0, "19/11/1984", "Henry Harvin"));
        books.add(new Book(1005, ".Net Platform", 3497.0, "6/3/1984", "Mark J. Price"));
        books.add(new Book(1001, "Python Learning", 715.0, "2/2/2020", "Martic C. Brown"));
        books.add(new Book(1002, "Modern Mainframe", 295.0, "19/5/1997", "Sharad"));

        for (Book book : books) {
            System.out.println(book);
        }
    }
}