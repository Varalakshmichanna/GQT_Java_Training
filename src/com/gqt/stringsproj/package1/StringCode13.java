// program to remove unnecessary spaces in between the strings
// sample ip: hi    good   morning
// sample op: hi good morning

package com.gqt.stringsproj.package1;
import java.util.Scanner;
public class StringCode13 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str=sc.nextLine();
		String str1="";
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==' ' && str.charAt(i+1)==' ') {
				
			}
			else {
				str1=str1+str.charAt(i);
			}
		}
		System.out.println(str1);
	}
}
