package com.Masai;

import java.util.Scanner;

public class Student {
	
	int rollNumber;
	String studentName;
      int marks;

      public Student() {
    	  
      }
      
      public Student(int  rollNumber,String studentName,int marks) {
    	  this.rollNumber=rollNumber;
    	  this.marks=marks;
    	  this.studentName=studentName;
    	  showDetails();
      }
      
      void showDetails()
      {
    	  System.out.println("Student Roll Number : "+rollNumber);
    	  System.out.println("Student Name: "+studentName);
    	  System.out.println("Student Mark : "+marks);
      }
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Number of Students you want to enter");
		int num=scan.nextInt();
		System.out.println("====================");
		for(int i=1;i<=num;i++)
		{
			System.out.println("Enter details of student "+i);
			System.out.println("Enter the Roll Number");
			int roll=scan.nextInt();
			System.out.println("Enter the Name");
			String name=scan.next();
			System.out.println("Enter the marks :");
			int marks=scan.nextInt();
			Student s=new Student(roll,name,marks);
			System.out.println("====================");
			scan.nextLine();
		}
		
      
	}

}
