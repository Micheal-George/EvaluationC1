package com.Masai;

import java.util.Scanner;

public class Course {

	int courseId;
	int courseFee;
	String courseName;
	
	 static void authenticate(String username,String password) {
		
		 if(username=="Admin"&&password=="1234")
		 {
			 Scanner scan=new Scanner(System.in);
			 System.out.println("Enter courseID");
			 int courseId=scan.nextInt();
			 System.out.println("Enter courseFee");
			 int courseFee=scan.nextInt();
			 System.out.println("Enter Course Name");
			 String courseName=scan.next();
			 Course c= new Course();
			 c.displayCourseDetails(courseId,courseFee,courseName);
		 }
		 else
		 {
			 System.out.println("Invalid Username or password");
		 }
		 
	}
	
	
	void displayCourseDetails(int courseId,int courseFee,String courseName) {
		System.out.println("courseID :"+courseId);
		System.out.println("courseFee :"+courseFee);
		System.out.println("courseName :"+courseName);
	}
	public static void main(String[] args) {
		
      authenticate("Admin","1234");
	}

}
