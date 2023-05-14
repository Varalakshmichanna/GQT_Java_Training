// Prime number or not
package com.gqt.questions.package1;
import java.util.Scanner;
public class prime {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n value: ");
		int n=sc.nextInt();
		int c=0;
		for(int j=2;j<n;j++) {
			if(n%j==0) {
				c=c+1;
			}
		}
		if(c==0) {
			System.out.println(n+" is a prime number");
		}
		else {
			System.out.println(n+" is not a prime number");
		}
	}
}
// Prime numbers in a given range
/*package com.gqt.questions.package1;
import java.util.Scanner;
public class prime {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n value: ");
		int n=sc.nextInt();
		int c1=0;
		for(int i=2;i>=2;i++) {
			int c=0;
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					c=c+1;
				}
			}
			if(c==0) {
				System.out.println(i);
				c1=c1+1;
			}
			if(c1==n) {
				break;
			}
		}
	}
}
*/