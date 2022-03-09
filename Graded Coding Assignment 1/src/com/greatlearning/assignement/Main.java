package com.greatlearning.assignement;

public class Main {

	public static void main(String[] args) {
		
		HrDepartment object_hrdepartment = new HrDepartment();
		TechDepartment object_techdepartment = new TechDepartment();
		AdminDepartment object_admindepartment = new AdminDepartment();
		
		System.out.println(object_admindepartment.departmentName());
		System.out.println(object_admindepartment.getTodaysWork());
		System.out.println(object_admindepartment.getWorkDeadline());
		System.out.println(object_admindepartment.isTodayAHoliday());
		
		System.out.println();
		
		System.out.println(object_hrdepartment.departmentName());
		System.out.println(object_hrdepartment.doActivity());
		System.out.println(object_hrdepartment.getTodaysWork());
		System.out.println(object_hrdepartment.getWorkDeadline());
		System.out.println(object_hrdepartment.isTodayAHoliday());
		
		System.out.println();
		
		System.out.println(object_techdepartment.departmentName());
		System.out.println(object_techdepartment.getTodaysWork());
		System.out.println(object_techdepartment.getWorkDeadline());
		System.out.println(object_techdepartment.getTechStackInformation());
		System.out.println(object_techdepartment.isTodayAHoliday());
	}
}
