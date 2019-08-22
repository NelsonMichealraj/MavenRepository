package org.scanner.empdetails;

import java.util.Scanner;

public class EmpDetails {
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
				
		System.out.println("Enter the Emp name");
		String ename = sc.nextLine();
		System.out.println("\n"+"Emp name is"+ ename+"\n");
		
		System.out.println("Enter the Emp Emailid");
		String emailid = sc.next();
		System.out.println("\n"+"Emp Email ID is "+emailid+"\n");
		
		System.out.println("Enter the Emp ID");
		int empid =sc.nextInt();
		System.out.println("\n"+"Emp Id is "+ empid+"\n");

		System.out.println("Enter the Emp sal");
		float sal= sc.nextFloat();
		System.out.println("\n"+"Emp sal is "+sal+"\n");
		
		System.out.println("Enter emp ph no.");
		long phno=sc.nextLong();
		System.out.println("\n"+"Emp phno is "+phno+"\n");
		
		System.out.println("Enter the Gender");
		char gender =sc.next().charAt(0);
		System.out.println("\n"+"Gender is "+gender+"\n");
		
		System.out.println("Enter the emp City");
		String city =sc.next();
		System.out.println("\n"+"Emp city is "+city+"\n");
		
	}
	
}
