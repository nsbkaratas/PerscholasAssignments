package org.perscholas.inheritance2;

public class LibraryInterfaceDemo {

	public static void main(String[] args) {
		//Test case #1
		KidUSer kid1 = new KidUSer();
		kid1.setAge(10);
		kid1.registerAccount();
		kid1.setBookType("Kids");
		kid1.requestBook();
		System.out.println();
		
		KidUSer kid2 = new KidUSer();
		kid2.setAge(18);
		kid2.registerAccount();
		kid2.setBookType("Fiction");
		kid2.requestBook();
		System.out.println();
		
		//Test case #2
		AdultUser adult1= new AdultUser();
		adult1.setAge(5);
		adult1.registerAccount();
		adult1.setBookType("Kids");
		adult1.requestBook();
		System.out.println();
		
		AdultUser adult2 = new AdultUser();
		adult2.setAge(23);
		adult2.registerAccount();
		adult2.setBookType("Fiction");
		adult2.requestBook();
		
		
	}

}
