package com.greatlearning.assignement;

public class AdminDepartment extends SuperDepartment{

	public String departmentName() {
		
		return ("Welcome to Admin Department ");
	}

	public String getTodaysWork() {
		
		return ("Complete your documents Submission");
	}
	
	public String getWorkDeadline() {
		
		return ("Complete by EOD ");
	}
	
//	public static void main(String[] args) {
//	
//	AdminDepartment obj = new AdminDepartment();
//	 System.out.println(obj.departmentName());
//	 System.out.println(obj.getWorkDeadline());
//	 System.out.println(obj.getTodaysWork());
//}
}
