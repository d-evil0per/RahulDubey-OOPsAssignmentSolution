package com.greatlearning.model;

/**
 * @author Rahul Dubey
 * @Last Updated: 27/03/2022
 *
 */
public class AdminDepartment extends SuperDepartment {
	/*
	 * This is the base Class and it contains 3 methods of return type String and
	 * will not accept any parameter, It extends the SuperDepartment Class.
	 */

	public AdminDepartment() {
		/**
		 * @Constructor: This is the default constructor of the AdminDepartment Class to
		 *               initialize the properties of super class
		 * @Param: None
		 * @return: Constructor doesn't have the return type
		 */
		/*
		 * re-Initializing the value of departmentName,todaysWork & workDeadline
		 * properties of super class
		 */
		super.departmentName = "Admin Department";
		super.todaysWork = "Complete your documents Submission";
		super.workDeadline = "Complete by EOD";
	}

	@Override
	public String departmentName() {
		/**
		 * @Method: overriding super class's  method to fetch the department name
		 * @Param: None
		 * @return: String
		 */
		return "Welcome to "+super.departmentName;
	}

	@Override
	public String getTodaysWork() {
		/**
		 * @Method: overriding super class's  method to fetch the Today's Work
		 * @Param: None
		 * @return: String
		 */
		return "Today's Work: "+super.todaysWork;
	}

	@Override
	public String getWorkDeadline() {
		/**
		 * @Method: overriding super class's method to fetch the work deadline
		 * @Param: None
		 * @return: String
		 */
		return "Today's Work Deadline: "+super.workDeadline;
	}

}
