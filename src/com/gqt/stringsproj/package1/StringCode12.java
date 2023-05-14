/*  replace all the vowels with a special character specified below:
 *  a--->@
 *  e--->#
 *  i--->$
 *  o--->%
 *  u---->&
 *  
 *  sample input: aeiou
 *  sample output: @#$%&
 */
package com.gqt.stringsproj.package1;
import java.util.Scanner;
public class StringCode12 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string: ");
		String str=sc.nextLine();
		str=str.toLowerCase();
		String str1="";
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='a') {
				str1=str1+"@";
			}
			else if(str.charAt(i)=='e') {
				str1=str1+"#";
			}
			else if(str.charAt(i)=='i') {
				str1=str1+"$";
			}
			else if(str.charAt(i)=='o') {
				str1=str1+"%";
			}
			else if(str.charAt(i)=='u') {
				str1=str1+"&";
			}
			else {
				str1=str1+str.charAt(i);
			}
		}
		System.out.println(str1);
	}
}
