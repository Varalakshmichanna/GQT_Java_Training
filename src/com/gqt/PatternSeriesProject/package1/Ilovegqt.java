package com.gqt.PatternSeriesProject.package1;
import java.util.Scanner;
public class Ilovegqt {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value: ");
		int n = sc.nextInt();
		for(int i=0; i<=n-1; i++) {
			// I
			for(int j=0; j<=n-1; j++) {
				if((i==0 && j<n/2) ||
					(i==n-1 && j<n/2) ||
					(j==n/4)
					) {
					System.out.print("# ");
					}
				else {
					System.out.print("  ");
				}
			}
			// love symbol
			for(int j=0;j<=n-1;j++) {
				if((j==0 && i>0 && i<=n/2) ||
				   (j==n-1 && i>0 && i<n/2) ||
				   (i-j==n/2) ||
				   (i+j==n-1+n/2) ||
				   (i==0 && j>0 && j<n/4+1) ||
				   (i==0 && j>3*n/4-1 && j<n-1) ||
				   (j-i==n/4+1 && j<=n/2) ||
				   (i+j==3*n/4-1 && j>=n/2)
					) {
					System.out.print("# ");
					}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("		");
			// G
			for(int j=0; j<=n-1; j++) {
				if((j==0 && i!=0 && i!=n-1)
					|| (i==0 && j<=n/2 && j!=0)
					|| (i==n/2 && j>=n/4 && j<=n/2)
					|| (i==n-1 && j>0 && j<=n/4)
					|| (j==n/4 && i>n/2) 
					|| (j==n/2 && i>n/2)
					) {
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			// Q
			for(int j=0; j<=n-1; j++) {
				if((i==0 && j>0 && j<n/2)
				   || (i==3*n/4 && j<n/2 && j>0)
				   || (j==0 && i>0 && i<3*n/4)
				   || (j==n/2 && i<3*n/4 && i>0)
				   || (i-j==n/4+1 && j>n/4 && j<3*n/4)
					) {
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			// T
			for(int j=0; j<=n-1; j++) {
				if((i==0 && j<n/2) ||
				   (j==n/4)
					) {
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}

