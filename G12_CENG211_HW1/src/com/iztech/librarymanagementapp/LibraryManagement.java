package com.iztech.librarymanagementapp;

public class LibraryManagement {

	private Issue[][] issues;

	public LibraryManagement() {

		this.issues = new Issue[3][50];
	}

	public LibraryManagement(Issue[][] issues) {

		this.issues = issues;
	}

	public LibraryManagement(LibraryManagement oldLibraryManagement) {

		if (oldLibraryManagement == null) {
			System.out.println("Fatal Error!");
			System.exit(0);
		}

		this.issues = oldLibraryManagement.issues;
	}

	public Issue[][] getIssues() {
		Issue[][] issues = copyIssueArray();
		return issues;
	}

	public void setIssues(Issue[][] issues) {
		this.issues = issues;
	}
	private Issue[][] copyIssueArray(){
		Issue[][] copyIssueArray = new Issue[3][50];
		for(int i=0; i<this.issues.length; i++) {
			for(int j=0; j< this.issues[i].length; j++) {
				copyIssueArray[i][j] = this.issues[i][j];
			}
		}
		return copyIssueArray;
	}

}
