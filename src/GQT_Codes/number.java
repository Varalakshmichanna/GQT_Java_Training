package GQT_Codes;
//Number - 0
/*import java.util.Scanner;
public class number {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value: ");
		int n = sc.nextInt();
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
	}
}
*/
// Number - 1 
/*import java.util.Scanner;
public class number {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value: ");
		int n = sc.nextInt();
		for(int i=0; i<=n-1; i++) {
			for(int j=0; j<=n-1; j++) {
				if((i==n-1 && j<n/2) ||
				   j==n/4 ||
				   (i+j==n/4 && j<n/2)
						) {
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
*/
// Number - 2 
/*import java.util.Scanner;
public class number {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value: ");
		int n = sc.nextInt();
		for(int i=0; i<=n-1; i++) {
			for(int j=0; j<=n-1; j++) {
				if((i==n-1 && j<=n/2) ||
				   (i==0 && j>0 && j<n/2) ||
				   (i+j==n-2 && j<=n/2) ||
				   (j==n/2 && i>0 && i<n/2) ||
				   (j==0 && i>0 && i<=n/4-1)
						) {
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
*/
// Number - 3 
/*import java.util.Scanner;
public class number {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value: ");
		int n = sc.nextInt();
		for(int i=0; i<=n-1; i++) {
			for(int j=0; j<=n-1; j++) {
				if((i==0 && j<n/2) ||
				   (i==n-1 && j<n/2) ||
				   (i==n/2 && j<n/2) ||
				   (j==n/2 && i!=0 && i!=n/2 && i!=n-1)
						) {
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
*/
// Number - 4 
/*import java.util.Scanner;
public class number {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value: ");
		int n = sc.nextInt();
		for(int i=0; i<=n-1; i++) {
			for(int j=0; j<=n-1; j++) {
				if(i==n/2 && j<n-1||
				   i+j==n/2 ||
				   j==n/2 && i<n-1
						) {
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
*/
// Number - 5
/*import java.util.Scanner;
public class number {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value: ");
		int n = sc.nextInt();
		for(int i=0; i<=n-1; i++) {
			for(int j=0; j<=n-1; j++) {
				if((i==0 && j<n/2) ||
				   (j==0 && i<n/2) ||
				   (i==n/2 && j<n/2) ||
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
	}
}
*/
//Number - 6
/*import java.util.Scanner;
public class number {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value: ");
		int n = sc.nextInt();
		for(int i=0; i<=n-1; i++) {
			for(int j=0; j<=n-1; j++) {
				if((i==0 && j<n/2 && j>0) ||
				   (j==0 && i>0 && i<n-1) ||
				   (i==n/2 && j<n/2) ||
				   (j==n/2 && i>n/2 && i<n-1) ||
				   (i==n-1 && j<n/2 && j>0)
					) {
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
*/
//Number - 7
/*import java.util.Scanner;
public class number {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value: ");
		int n = sc.nextInt();
		for(int i=0; i<=n-1; i++) {
			for(int j=0; j<=n-1; j++) {
				if((i==0) ||
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
	}
}
*/
//Number - 8
/*import java.util.Scanner;
public class number {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value: ");
		int n = sc.nextInt();
		for(int i=0; i<=n-1; i++) {
			for(int j=0; j<=n-1; j++) {
				if((j==0 && i>0 && i<n-1 && i!=n/2)
				   || (j==n/2 && i>0 && i<n-1 && i!=n/2)
				   || (i==0 && j<n/2 && j>0)
				   || (i==n-1 && j<n/2 && j>0)
				   || (i==n/2 && j>0 && j<n/2)
					) {
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
*/
//Number - 9
/*import java.util.Scanner;
public class number {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value: ");
		int n = sc.nextInt();
		for(int i=0; i<=n-1; i++) {
			for(int j=0; j<=n-1; j++) {
				if((j==0 && i>0 && i<n/2)
				   || (j==n/2 && i!=0)
				   || (i==0 && j<n/2 && j>0)
				   || (i==n/2 && j>0 && j<n/2)
					) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}		
	}
}*/