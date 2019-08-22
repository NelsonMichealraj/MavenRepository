package org.scanner.empdetails;

import java.util.Scanner;

public class Mark
{
	public static void main(String[] args) 
	{
		Scanner s =new Scanner(System.in);
		
		System.out.println("Enter Stud name");
		String sname = s.nextLine();
		System.out.println("Student Name: "+sname+"\n");
		
		
		System.out.println("Enter Student ID");
		int sid=s.nextInt();
		System.out.println("Student ID: "+ sid+"\n");
		
		System.out.println("Enter Mark1");
		int m1 =s.nextInt();
		System.out.println("Mark1: "+m1+"\n");
		
		System.out.println("Enter Mark2");
		int m2 =s.nextInt();
		System.out.println("Mark2: "+m2+"\n");
		
		System.out.println("Enter Mark3");
		int m3 =s.nextInt();
		System.out.println("Mark3: "+m3+"\n");
		
		int totalmark =m1+m2+m3;
		int avgmark = (m1+m2+m3)/3;
		
		System.out.println("Total Mark: "+totalmark+"\n");
		System.out.println("AverageMark: "+avgmark);
				
	}
}
