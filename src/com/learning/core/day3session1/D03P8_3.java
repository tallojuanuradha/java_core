package com.learning.core.day3session1;

import java.util.*;

class Book implements Comparable<Book> {


	
	
	private int bookId;
    private String title;
    private double price;
    private String author;
    private String dateOfPublication;

    public Book(int bookId, String title, double price, String author, String dateOfPublication) {
        this.setBookId(bookId);
        this.title = title;
        this.price = price;
        this.author = author;
        this.dateOfPublication = dateOfPublication;
    }

    @Override
    public String toString() {
        return getBookId() + " " + getTitle() + "\n" + getPrice() + " " + getAuthor() + "\n" + dateOfPublication;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBookId(), getTitle(), getPrice(), getAuthor(), dateOfPublication);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Book book = (Book) obj;
        return getBookId() == book.getBookId() &&
                Double.compare(book.getPrice(), getPrice()) == 0 &&
                Objects.equals(getTitle(), book.getTitle()) &&
                Objects.equals(getAuthor(), book.getAuthor()) &&
                Objects.equals(dateOfPublication, book.dateOfPublication);
    }

    @Override
    public int compareTo(Book other) {
        return Integer.compare(this.getBookId(), other.getBookId());
    }

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public double getPrice() {
		return price;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}
}

public class D03P8_3 {
    public static void main(String[] args) {
        TreeSet<Book> bookSet = new TreeSet<>();

        
        bookSet.add(new Book(1001, "Python Learning", 715.0, "Martic C. Brown", "2/2/2020"));
        bookSet.add(new Book(1002, "Modern Mainframe", 295.0, "Sharad", "19/5/1997"));
        bookSet.add(new Book(1003, "Java Programming", 295.0, "Henry Harvin", "19/11/1984"));
        bookSet.add(new Book(1004, "Read C++", 3497.0, "Mark J. Price", "6/3/1984"));
        bookSet.add(new Book(1005, ".Net Platform", 523.0, "Gilad Bracha", "23/11/1984"));

      
        for (Book book : bookSet) {
            System.out.println(book);
            System.out.println();
        }
    }
}
