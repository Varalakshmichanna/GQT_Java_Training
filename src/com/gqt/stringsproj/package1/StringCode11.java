// program to count total no.of words in a given string
// input: Hi good morning
// output: 3
package com.gqt.stringsproj.package1;
import java.util.Scanner;
public class StringCode11 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String: ");
		String s=sc.nextLine();
		int spc_cnt=0;
		s=s.trim();
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==' ') {
				spc_cnt++;
			}
		}
		int word_cnt=spc_cnt+1;
		System.out.println("Word count = "+word_cnt);
	}
}
