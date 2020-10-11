package _01_Lambda_Methods;

import java.util.Random;

public class LambdaMethods {
	public static void main(String[] args) {
		// 1. Look at the SpecialPrinter function interface.
	
		// Here is an example of calling the printCustomMessage method with a lambda.
		// This prints the passed in String 10 times.
		printCustomMessage((s)->{
			for(int i = 0; i < 10; i++) {
				System.out.println(s);
			}
		}, "repeat");
		
		//2. Call the printCustonMessage method using a lambda so that the String prints backwards.
		printCustomMessage((s)->{
			String sCopy="";
			for(int i=0; i<s.length(); i++) {
				sCopy+=s.charAt(s.length()-i-1);
				System.out.println(sCopy);
			}
		}, "backwards");
		//3. Call the printCustonMessage method using a lambda so that the String prints with a mix between upper an lower case characters.
		printCustomMessage((s)->{
			String sCopy="";
			Random rand=new Random();
			int charCase;
			String chars="";
			int capitals=0;
			int lowercase=0;
			for(int i=0; i<s.length(); i++) {
				chars="";
				charCase=rand.nextInt(2);
				if(charCase==0) {
					chars+=s.charAt(i);
					chars=chars.toUpperCase();
					sCopy+=chars;
					capitals++;
				}
				else{
					chars+=s.charAt(i);
					chars=chars.toLowerCase();
					sCopy+=chars;
					lowercase++;
				}
				System.out.println(sCopy);
			}
			System.out.println(capitals);
			System.out.println(lowercase);
		}, "AP Human Geography");
		//4. Call the printCustonMessage method using a lambda so that the String prints with a period in between each character.
		printCustomMessage((s)->{
			String sCopy="";
			for(int i=0; i<s.length(); i++) {
				sCopy+=s.charAt(i);
				sCopy+=".";
				System.out.println(sCopy);
			}
		}, "Acronym");
		//5. Call the printCustonMessage method using a lambda so that the String prints without any vowels.
		printCustomMessage((s)->{
			String sCopy="";
			for(int i=0; i<s.length(); i++) {
				if(s.charAt(i)=='a') {
					System.out.println("deported");
				}
				else if(s.charAt(i)=='e') {
					System.out.println("deported");
				}
				else if(s.charAt(i)=='i') {
					System.out.println("deported");
				}
				else if(s.charAt(i)=='o') {
					System.out.println("deported");
				}
				else if(s.charAt(i)=='u') {
					System.out.println("deported");
				}
				else {
					sCopy+=s.charAt(i);
					System.out.println(sCopy);
				}
			}
		}, "Vowels are illegal");
	}
	
	public static void printCustomMessage(SpecialPrinter sp, String value) {
		sp.printSpecial(value);
	}
}
	
