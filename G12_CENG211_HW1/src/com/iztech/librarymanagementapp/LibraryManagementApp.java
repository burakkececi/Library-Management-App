package com.iztech.librarymanagementapp;

public class LibraryManagementApp {

	public static void main(String[] args) {

		LibraryQuery query = new LibraryQuery();

		//for first question
		query.getMaxIssuedBook();
		//for second question
		query.getMemberMostIssue();
		//for third question
		query.getHighPenalty();
		//for fourth question
		query.getMostCopy();
		//for fifth question
		query.getFewestCopyIssuedBooks();
		//for six question
		query.getMemberLeastIssue();
		
		
		
	}

}
