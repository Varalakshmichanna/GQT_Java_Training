/*    i			 i		    j		        k		
 *   uni	  school	  class		     students	
 *    0			0           0               5
 *     					   	1               5
 *              1           0               5
 *     				        1               5
 *    1			0           0               5
 *     					   	1               5
 *              1           0               5
 *     				        1               5
 */

package com.gqt.arraysproj.package1;
import java.util.Scanner;
public class ArrayCode4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter count of universities: ");
		int uni = sc.nextInt();
		System.out.println("Enter count of schools: ");
		int sch = sc.nextInt();
		System.out.println("Enter count of classes: ");
		int cls = sc.nextInt();
		System.out.println("Enter count of students: ");
		int stu = sc.nextInt();
		int arr[][][][]=new int[uni][sch][cls][stu];
		// store data
		for(int i=0;i<uni;i++) {
			System.out.println("Inside university "+(i+1));
			for(int j=0;j<sch;j++) {
				System.out.println("Inside school "+(j+1));
				for(int k=0;k<cls;k++) {
					System.out.println("Inside class "+(k+1));
					for(int l=0;l<stu;l++) {
						System.out.println("Enter the marks of student no: "+(l+1));
						arr[i][j][k][l]=sc.nextInt();
					}
				}
			}
		}
		// fetching
		System.out.println("-----------------------------------------");
		for(int i=0;i<uni;i++) {
			System.out.println("Inside university "+(i+1));
			for(int j=0;j<sch;j++) {
				System.out.println("Inside school "+(j+1));
				for(int k=0;k<cls;k++) {
					System.out.println("Inside class "+(k+1));
					for(int l=0;l<stu;l++) {
						System.out.println("The marks of student no: "+(l+1)+" is = "+arr[i][j][k][l]);
					}
				}
			}
		}
	}
}
