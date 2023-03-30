package GQT_Codes;
//Alphabet - A
/*import java.util.Scanner;
public class Progrm1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value: ");
		int n = sc.nextInt();
		for(int i=0; i<=n; i++) {
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
*/
//Alphabet - B
/*import java.util.Scanner;
public class Progrm1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value: ");
		int n = sc.nextInt();
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
	}
}*/

//Alphabet - c
/*import java.util.Scanner;
public class Progrm1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value: ");
		int n = sc.nextInt();
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
	}
}*/

//Alphabet - D
/*import java.util.Scanner;
public class Progrm1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value: ");
		int n = sc.nextInt();
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
	}
}*/

//Alphabet - E
/*import java.util.Scanner;
public class Progrm1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value: ");
		int n = sc.nextInt();
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
	}
}
*/
//Alphabet - F
/*import java.util.Scanner;
public class Progrm1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value: ");
		int n = sc.nextInt();
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
	}
}
*/
//Alphabet - G
/*import java.util.Scanner;
public class Progrm1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value: ");
		int n = sc.nextInt();
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
	}
}
*/
//Alphabet - H
/*import java.util.Scanner;
public class Progrm1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value: ");
		int n = sc.nextInt();
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
	}
}
*/
//Alphabet - I
/*import java.util.Scanner;
public class Progrm1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value: ");
		int n = sc.nextInt();
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
	}
}
*/
//Alphabet - J
/*import java.util.Scanner;
public class Progrm1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value: ");
		int n = sc.nextInt();
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
	}
}
*/
//Alphabet - K
/*import java.util.Scanner;
public class Progrm1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value: ");
		int n = sc.nextInt();
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
	}
}
*/
//Alphabet - L
/*import java.util.Scanner;
public class Progrm1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value: ");
		int n = sc.nextInt();
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
	}
}
*/
//Alphabet - M
/*import java.util.Scanner;
public class Progrm1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value: ");
		int n = sc.nextInt();
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
	}
}
*/
//Alphabet - N
/*import java.util.Scanner;
public class Progrm1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value: ");
		int n = sc.nextInt();
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
	}
}
*/
//Alphabet - O
/*import java.util.Scanner;
public class Progrm1 {
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
//Alphabet - P
/*import java.util.Scanner;
public class Progrm1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value: ");
		int n = sc.nextInt();
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
	}
}
*/
//Alphabet - Q
/*import java.util.Scanner;
public class Progrm1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value: ");
		int n = sc.nextInt();
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
	}
}
*/
//Alphabet - R
/*import java.util.Scanner;
public class Progrm1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value: ");
		int n = sc.nextInt();
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
	}
}
*/
//Alphabet - S
/*import java.util.Scanner;
public class Progrm1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value: ");
		int n = sc.nextInt();
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
	}
}
*/
//Alphabet - T
/*import java.util.Scanner;
public class Progrm1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value: ");
		int n = sc.nextInt();
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
	}
}
*/
//Alphabet - U
/*import java.util.Scanner;
public class Progrm1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value: ");
		int n = sc.nextInt();
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
	}
}
*/
//Alphabet - V
/*import java.util.Scanner;
public class Progrm1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value: ");
		int n = sc.nextInt();
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
						System.out.print(" ");
					}
				}
			System.out.println();
		}		
	}
}
*/
//Alphabet - W
/*import java.util.Scanner;
public class Progrm1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value: ");
		int n = sc.nextInt();
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
	}
}
*/
//Alphabet - X
/*import java.util.Scanner;
public class Progrm1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value: ");
		int n = sc.nextInt();
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
	}
}
*/
//Alphabet - Y
/*import java.util.Scanner;
public class Progrm1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value: ");
		int n = sc.nextInt();
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
	}
}
*/
//Alphabet - Z
/*import java.util.Scanner;
public class Progrm1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value: ");
		int n = sc.nextInt();
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
	}
}
*/