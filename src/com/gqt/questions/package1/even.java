package com.gqt.questions.package1;
import java.util.Scanner;
public class even {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number: ");
		int n=sc.nextInt();
		int c=0;
		for(int i=1;i<=n*2;i++) {
			if(i%2==0) {
				System.out.println(i);
				c=c+1;
			}
			if(c==n) {
				break;
			}
		}
	}
}
