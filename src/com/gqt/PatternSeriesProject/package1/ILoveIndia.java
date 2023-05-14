package com.gqt.PatternSeriesProject.package1;
import java.util.Scanner;
public class ILoveIndia {
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
					System.out.print("#1 ");
					}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("		");
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
			//N
			for(int j=0; j<=n-1; j++) {
				if(j==0 || 
				   j==n-1 ||
				   i==j
					) {
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("	    ");
			//D
			for(int j=0; j<=n-1; j++) {
				if(j==0 
					|| (i==0 && j<n/2)
					|| (i==n-1 && j<n/2)
					|| (j==n/2 && i!=0 && i!=n-1)
					) {
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
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
			// A
			for(int j=0; j<=n; j++) {
				if(j==0 || j==n/2 || (i==0 && j<=n/2) || (i== n/2 && j<=n/2)) {
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
