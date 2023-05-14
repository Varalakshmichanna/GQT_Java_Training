//program to segregate all alphabets into string-2, numbers to string-3 and special characters to string-4
package com.gqt.stringsproj.package1;
import java.util.Scanner;
public class StringCode15 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str=sc.nextLine();
		String alphabets="";
		String numbers="";
		String special_char="";
		for(int i=0;i<str.length();i++) {
			if (Character.isDigit(str.charAt(i))) {
				numbers=numbers+str.charAt(i);
			}else {
				if(Character.isAlphabetic(str.charAt(i))) {
					alphabets=alphabets+str.charAt(i);
				}
				else {
					special_char=special_char+str.charAt(i);
				}
			}
		}
		System.out.println("Alphabets in the given string: "+alphabets);
		System.out.println("Numbers in the given string: "+numbers);
		System.out.println("Special characters in the given string: "+special_char);
	}
}
