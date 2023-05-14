package com.gqt.PatternSeriesProject.package1;
import java.util.Scanner;
public class GQT_pattern {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value: ");
		int n = sc.nextInt();
		for(int i=0; i<=n-1; i++) {
			// logic for G
			for(int j=0; j<=n-1; j++) {
				if((j==0 && i!=0 && i!=n-1)
					|| (i==0 && j<=n/2 && j!=0)
					|| (i==n/2 && j>=n/4 && j<=n/2)
					|| (i==n-1 && j>0 && j<=n/4)
					|| (j==n/4 && i>n/2) 
					|| (j==n/2 && i>n/2)
					) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			// logic for R
			for(int j=0; j<=n-1; j++) {
				if(j==0 ||
				   (i==0 && j<n/2) ||
				   (i==n/2 && j<n/2) ||
				   (j==n/2 && i>0 && i<n/2) ||
				   (i-j==n/2)
					) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			// logic for N
			for(int j=0; j<=n-1; j++) {
				if(j==0 || 
				   j==n-1 ||
				   i==j
					) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("	    ");
			// logic for A
			for(int j=0; j<=n; j++) {
				if(j==0 || j==n/2 || (i==0 && j<=n/2) || (i== n/2 && j<=n/2)) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			// logic for R
			for(int j=0; j<=n-1; j++) {
				if(j==0 ||
				   (i==0 && j<n/2) ||
				   (i==n/2 && j<n/2) ||
				   (j==n/2 && i>0 && i<n/2) ||
				   (i-j==n/2)
					) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			// logic E
			for(int j=0; j<=n-1; j++) {
				if(j==0 
					|| (i==0 && j<=n/2)
					|| (i==n/2 && j<=n/2)
					|| (i==n-1 && j<=n/2)
					) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			// logic N
			for(int j=0; j<=n-1; j++) {
				if(j==0 || 
				   j==n-1 ||
				   i==j
					) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("	    ");
			// logic D
			for(int j=0; j<=n-1; j++) {
				if(j==0 
					|| (i==0 && j<n/2)
					|| (i==n-1 && j<n/2)
					|| (j==n/2 && i!=0 && i!=n-1)
					) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			// logic R
			for(int j=0; j<=n-1; j++) {
				if(j==0 ||
				   (i==0 && j<n/2) ||
				   (i==n/2 && j<n/2) ||
				   (j==n/2 && i>0 && i<n/2) ||
				   (i-j==n/2)
					) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			// logic A
			for(int j=0; j<=n; j++) {
				if(j==0 || j==n/2 || (i==0 && j<=n/2) || (i== n/2 && j<=n/2)) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}		
	}
}
