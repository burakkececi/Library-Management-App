package com.iztech.librarymanagementapp;

public class Library {

	private Book[] books;

	public Library() {
		this.books = new Book[100];
	}

	public Library(Book[] book) {
		this.books = book;
	}

	public Library(Library oldLibrary) {

		if (oldLibrary == null) {
			System.out.println("Fatal Error");
			System.exit(0);
		}
		this.books = oldLibrary.books;
	}

	public Book[] getBook() {

		Book[] copyBookArray = new Book[this.books.length];
		for (int i = 0; i < this.books.length; i++) {
			copyBookArray[i] = this.books[i];
		}
		return copyBookArray;
	}

	public void setBook(Book[] books) {

		this.books = books;
	}

}
