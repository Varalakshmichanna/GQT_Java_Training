// program to find no.of vowels and consonants in a given string
package com.gqt.stringsproj.package1;
import java.util.Scanner;
public class StringCode10 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str=sc.nextLine();
		int vowel_cnt=0;
		int cons_cnt=0;
		str=str.toLowerCase();
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='a' || str.charAt(i)=='e' ||str.charAt(i)=='i' ||str.charAt(i)=='o' ||str.charAt(i)=='u') {
				vowel_cnt++;
			}
			else {
				cons_cnt++;
			}
		}
		System.out.println("Vowel count: "+vowel_cnt);
		System.out.println("Consonant count: "+cons_cnt);
	}
}
