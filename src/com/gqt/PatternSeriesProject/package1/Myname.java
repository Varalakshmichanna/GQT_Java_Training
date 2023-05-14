package com.gqt.PatternSeriesProject.package1;
import java.util.Scanner;
public class Myname {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name you want to display: ");
		String name = sc.nextLine();
		name=name.toUpperCase();
		System.out.println("Enter size of letter: ");
		int n = sc.nextInt();
		int r=0;
		int col=0;
		for(int k=0;k<name.length();k++) {
			switch(name.charAt(k)) {
			case 'A':
				for(int i=0; i<=n; i++) {
					for(int j=0; j<=n; j++) {
						if((j==0 && i!=0) || (j==n/2 && i!=0) || (i==0 && j<n/2 && j!=0) || (i== n/2 && j<n/2)) {
							System.out.print("* ");
							}
						else {
							System.out.print("  ");
						}
					}
					System.out.println();
				}
				System.out.println();
				break;
			case 'B':
				for(int i=0; i<=n-1; i++) {
					for(int j=0; j<=n-1; j++) {
						if(j==0
							|| (j==n/2 && i!=n/2 && i!=0 && i!=n-1) 
							|| (i==0 && j<n/2) 
							|| (i==n/2 && j<n/2)
							|| (i==n-1 && j<n/2)
							) {
							System.out.print("* ");
						}
						else {
							System.out.print("  ");
						}
					}
					System.out.println();
				}
				System.out.println();
				break;
			case 'C':
				for(int i=0; i<=n-1; i++) {
					for(int j=0; j<=n-1; j++) {
						if((j==0 && i!=0 && i!=n-1)
							|| (i==0 && j<=n/2 && j!=0)
							|| (i==n-1 && j<=n/2 && j!=0)
							) {
							System.out.print("* ");
						}
						else {
							System.out.print("  ");
						}
					}
					System.out.println();
				}		
				System.out.println();
				break;
			case 'D':
				for(int i=0; i<=n-1; i++) {
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
					System.out.println();
				}		
				System.out.println();
				break;
			case 'E':
				for(int i=0; i<=n-1; i++) {
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
					System.out.println();
				}		
				System.out.println();
				break;
			case 'F':
				for(int i=0; i<=n-1; i++) {
					for(int j=0; j<=n-1; j++) {
						if(j==0 
							|| (i==0 && j<=n/2)
							|| (i==n/2 && j<=n/2)
							) {
							System.out.print("* ");
						}
						else {
							System.out.print("  ");
						}
					}
					System.out.println();
				}		
				System.out.println();
				break;
			case 'G':
				for(int i=0; i<=n-1; i++) {
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
					System.out.println();
				}		
				System.out.println();
				break;
			case 'H':
				for(int i=0; i<=n-1; i++) {
					for(int j=0; j<=n-1; j++) {
						if(j==0 ||
						   (i==n/2 && j<=n/2)||
						   j==n/2
							) {
							System.out.print("* ");
						}
						else {
							System.out.print("  ");
						}
					}
					System.out.println();
				}		
				System.out.println();
				break;
			case 'I':
				for(int i=0; i<=n-1; i++) {
					for(int j=0; j<=n-1; j++) {
						if((i==0 && j<n/2) ||
						   (i==n-1 && j<n/2) ||
						   (j==n/4)
							) {
							System.out.print("* ");
						}
						else {
							System.out.print("  ");
						}
					}
					System.out.println();
				}		
				System.out.println();
				break;
			case 'J':
				for(int i=0; i<=n-1; i++) {
					for(int j=0; j<=n-1; j++) {
						if((i==0 && j<n/2) ||
						   (j==n/4) ||
						   (i==n-1 && j<n/4) ||
						   (j==0 && i>=(3*n)/4)
							) {
							System.out.print("* ");
						}
						else {
							System.out.print("  ");
						}
					}
					System.out.println();
				}		
				System.out.println();
				break;
			case 'K':
				for(int i=0; i<=n-1; i++) {
					for(int j=0; j<=n-1; j++) {
						if(j==0 ||
						   i+j==n/2 ||
						   i-j==n/2
							) {
							System.out.print("* ");
						}
						else {
							System.out.print("  ");
						}
					}
					System.out.println();
				}		
				System.out.println();
				break;
			case 'L':
				for(int i=0; i<=n-1; i++) {
					for(int j=0; j<=n-1; j++) {
						if(j==0 ||
						   (i==n-1 && j<=n/2)
							) {
							System.out.print("* ");
						}
						else {
							System.out.print("  ");
						}
					}
					System.out.println();
				}		
				System.out.println();
				break;
			case 'M':
				for(int i=0; i<=n-1; i++) {
					for(int j=0; j<=n-1; j++) {
						if(j==0 || 
						   j==n/2 ||
						   (i==j && i<=n/4) ||
						   (i+j==n/2 && i<=n/4)
							) {
							System.out.print("* ");
						}
						else {
							System.out.print("  ");
						}
					}
					System.out.println();
				}		
				System.out.println();
				break;
			case 'N':
				for(int i=0; i<=n-1; i++) {
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
					System.out.println();
				}		
				System.out.println();
				break;
			case 'O':
				for(int i=0; i<=n-1; i++) {
					for(int j=0; j<=n-1; j++) {
						if((j==0 && i>0 && i<n-1)
						   || (j==n/2 && i>0 && i<n-1)
						   || (i==0 && j<n/2 && j>0)
						   || (i==n-1 && j<n/2 && j>0)
							) {
							System.out.print("* ");
						}
						else {
							System.out.print("  ");
						}
					}
					System.out.println();
				}		
				System.out.println();
				break;
			case 'P':
				for(int i=0; i<=n-1; i++) {
					for(int j=0; j<=n-1; j++) {
						if(j==0 ||
						   (i==0 && j<n/2) ||
						   (i==n/2 && j<n/2) ||
						   (j==n/2 && i>0 && i<n/2)
							) {
							System.out.print("* ");
						}
						else {
							System.out.print("  ");
						}
					}
					System.out.println();
				}		
				System.out.println();
				break;
			case 'Q':
				for(int i=0; i<=n-1; i++) {
					for(int j=0; j<=n-1; j++) {
						if((i==0 && j>0 && j<n/2)
						   || (i==3*n/4 && j<n/2 && j>0)
						   || (j==0 && i>0 && i<3*n/4)
						   || (j==n/2 && i<3*n/4 && i>0)
						   || (i-j==n/4+1 && j>n/4 && j<3*n/4)
							) {
							System.out.print("* ");
						}
						else {
							System.out.print("  ");
						}
					}
					System.out.println();
				}		
				System.out.println();
				break;
			case 'R':
				for(int i=0; i<=n-1; i++) {
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
					System.out.println();
				}		
				System.out.println();
				break;
			case 'S':
				for(int i=0; i<=n-1; i++) {
					for(int j=0; j<=n-1; j++) {
						if((i==0 && j<n/2 && j>0) ||
						   (j==0 && i<n/2 && i>0) ||
						   (i==n/2 && j<n/2 && j>0) ||
						   (j==n/2 && i>n/2 && i<n-1) ||
						   (i==n-1 && j<n/2)
							) {
							System.out.print("* ");
						}
						else {
							System.out.print("  ");
						}
					}
					System.out.println();
				}		
				System.out.println();
				break;
			case 'T':
				for(int i=0; i<=n-1; i++) {
					for(int j=0; j<=n-1; j++) {
						if((i==0 && j<n/2) ||
						   (j==n/4)
							) {
							System.out.print("* ");
						}
						else {
							System.out.print("  ");
						}
					}
					System.out.println();
				}		
				System.out.println();
				break;
			case 'U':
				for(int i=0; i<=n-1; i++) {
					for(int j=0; j<=n-1; j++) {
						if((j==0 && i<n-1) ||
						   (j==n/2 && i<n-1) ||
						   (i==n-1 && j>0 && j<n/2)
							) {
							System.out.print("* ");
						}
						else {
							System.out.print("  ");
						}
					}
					System.out.println();
				}		
				System.out.println();
				break;
			case 'V':
				for(int i=0; i<=n-1; i++) {
					for(int j=0; j<=n-1; j++) {
							if((j==0 && i<=n/2) ||
							   (i-j==n/2) ||
							   (i+j==n-1+n/2) ||
							   (j==n-1 && i<=n/2)
								) {
								System.out.print("*");
							}
						else {
							System.out.print("  ");
						}
					}
					System.out.println();
				}		
				System.out.println();
				break;
			case 'W':
				for(int i=0; i<=n-1; i++) {
					for(int j=0; j<=n-1; j++) {
						if(j==0 ||
						   j==n-1 ||
						   (i+j==n-1 && j<=n/2) ||
						   (i==j && j>=n/2)
							) {
							System.out.print("* ");
						}
						else {
							System.out.print("  ");
						}
					}
					System.out.println();
				}		
				System.out.println();
				break;
			case 'X':
				for(int i=0; i<=n-1; i++) {
					for(int j=0; j<=n-1; j++) {
						if(i==j ||
						   i+j==n-1
							) {
							System.out.print("* ");
						}
						else {
							System.out.print("  ");
						}
					}
					System.out.println();
				}		
				System.out.println();
				break;
			case 'Y':
				for(int i=0; i<=n-1; i++) {
					for(int j=0; j<=n-1; j++) {
						if((i==j && j<=n/2) ||
						   (i+j==n-1 && j>=n/2) ||
						   (j==n/2 && i>=n/2)
							) {
							System.out.print("* ");
						}
						else {
							System.out.print("  ");
						}
					}
					System.out.println();
				}		
				System.out.println();
				break;
			case 'Z':
				for(int i=0; i<=n-1; i++) {
					for(int j=0; j<=n-1; j++) {
						if(i==0 ||
						   i==n-1 ||
						   i+j==n-1
							) {
							System.out.print("* ");
						}
						else {
							System.out.print("  ");
						}
					}
					System.out.println();
				}		
				System.out.println();
				break;
			}
		}
	}
}
			
		