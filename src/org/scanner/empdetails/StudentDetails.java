package org.scanner.empdetails;

import java.util.Scanner;

public class StudentDetails 
{
	public static void main(String[] args) 
	{
		Scanner s =new Scanner(System.in);
		
		System.out.println("Enter the Student Name");
		String studname= s.nextLine();
		System.out.println("Student Name :"+studname+"\n");
		
		System.out.println("Enter the Student ID ");
		int studid =s.nextInt();
		System.out.println("Student ID: "+studid+"\n");
		
		System.out.println("Enter the Student PH No. ");
		long phno =s.nextLong();
		System.out.println("Student PH No.: "+phno+"\n");
		
		System.out.println("Enter Student Email ID");
		String  email=s.next();
		System.out.println("Student Email ID :"+email+ "\n");
		
		System.out.println("Enter Student Gender");
		String gender =s.next();
		System.out.println("Studnt Gender "+gender+"\n");
		
		System.out.println("Enter Student City");
		String city= s.next();
		System.out.println("City of the Student :"+city+"\n");
		
		System.out.println("Enter Student Department");
		String  dept=s.next();
		System.out.println("Student Department ID :"+dept+ "\n");
		
	}
}
