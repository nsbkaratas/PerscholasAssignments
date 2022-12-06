package org.perscholas.inheritance2;

public interface LibraryUser {
	public void registerAccount();
	public void requestBook();
}
class KidUSer implements LibraryUser{
	int age;
	String bookType;
	public void registerAccount() {
		if(age<=11) {
			System.out.println("You have successfully registered under a Kids Account");
		}else if(age > 11) {
			System.out.println("Sorry, Age must be less than 12 to register as a kid");
		}
	}
	public void requestBook() {
		if(bookType.equals("Kids")) {
			System.out.println("Book Issued successfully, please return the book within 10 days");
		}else {
			System.out.println("Oops, you are allowed to take only kids books");
		}
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getBookType() {
		return bookType;
	}
	public void setBookType(String bookType) {
		this.bookType = bookType;
	}
	
}
class AdultUser implements LibraryUser{
	int age;
	String bookType;
	public void registerAccount() {
		if(age>=12) {
			System.out.println("You have successfully registered under an Adult Account");
		}else if(age<=11) {
			System.out.println("Sorry, Age must be greater than 12 to register as an adult");
		}
	}
	public void requestBook() {
		if(bookType.equals("Fiction")) {
			System.out.println("Book Issued successfully, please return the book within 7 days");
		}else {
			System.out.println("Oops, you are allowed to take only adult Fiction books");
		}
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getBookType() {
		return bookType;
	}
	public void setBookType(String bookType) {
		this.bookType = bookType;
	}
	
}
