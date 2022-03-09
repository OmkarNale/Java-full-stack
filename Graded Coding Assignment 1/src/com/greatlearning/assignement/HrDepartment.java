package com.greatlearning.assignement;

public class HrDepartment extends SuperDepartment {

	public String departmentName() {
		
		return ("Welcome to HR Department");
	}

	public String getTodaysWork() {
		
		return ("Fill today’s worksheet and mark your attendance");
	}
	
	public String getWorkDeadline() {
		
		return ("Complete by EOD ");
	}
	
	public String doActivity() {
		
		return ("team Lunch");
	}
	
//	public static void main(String[] args) {
//	
//	  HrDepartment obj = new HrDepartment();
//	 System.out.println(obj.departmentName());
//	 System.out.println(obj.getWorkDeadline());
//	 System.out.println(obj.getTodaysWork());
//	 System.out.println(obj.doActivity());
//	 }
}
