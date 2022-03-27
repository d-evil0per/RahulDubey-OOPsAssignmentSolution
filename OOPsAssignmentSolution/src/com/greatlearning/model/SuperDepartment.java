package com.greatlearning.model;

/**
 * @author Rahul Dubey
 * @Last Updated: 27/03/2022
 *
 */
public class SuperDepartment {
	/*
	 * This is the Super Class and it contains 4 methods of return type String and
	 * will not accept any parameter All the base class like
	 * AdminDepartment,HRDepartment,TechDepartment will extend this class as
	 * hierarchical inheritance
	 * 
	 * 
	 */

	// Private data Members to hold the properties of the SuperDepartment class
	public String departmentName;
	public String todaysWork;
	public String workDeadline;
	private String todayAHoliday;

	public SuperDepartment() {
		/**
		 * @Constructor: This is the default constructor of the SuperDepartment Class to
		 *               initialize all it's properties
		 * @Param: None
		 * @return: Constructor doesn't have the return type
		 */
		// Properties initialization process through default constructor
		this.departmentName = "Super Department";
		this.todaysWork = "No Work as of now";
		this.workDeadline = "Nil";
		this.todayAHoliday = "Today is not a holiday";
	}

	public String departmentName() {
		/**
		 * @Method: getter method to fetch the department name
		 * @Param: None
		 * @return: String
		 */
		return this.departmentName;
	}

	public String getTodaysWork() {
		/**
		 * @Method: getter method to fetch the Today's work
		 * @Param: None
		 * @return: String
		 */
		return this.todaysWork;
	}

	public String getWorkDeadline() {
		/**
		 * @Method: getter method to fetch the work deadline
		 * @Param: None
		 * @return: String
		 */
		return this.workDeadline;
	}

	public String isTodayAHoliday() {
		/**
		 * @Method: getter method to fetch whether today is holiday or not
		 * @Param: None
		 * @return: String
		 */
		return "Is today a holiday?: "+this.todayAHoliday;
	}
}
