package com.app;
import com.util.*;

public class BookTest {
	public static void main(String[] args) {
		Book [] booklist=new Book[5];
		booklist[0]=new Ebook("programming in java", 1200);
		booklist[1]=new PaperBook("php cookbook", 800);
		booklist[2]=new Ebook("HTML basics", 4000);
		booklist[3]=new PaperBook("Design patterns", 1700);
		booklist[4]=new Ebook("Java 11", 2000);
		
		for (int i = 0; i < booklist.length; i++) {
			booklist[i].calculateCost();
			System.out.println(booklist[i].toString());
			System.out.println("**************************************");
		}
		
	}
}
