package com.greatlearning.model;

/**
 * @author Rahul Dubey
 * @Last Updated: 27/03/2022
 *
 */
public class HRDepartment extends SuperDepartment {

	/*
	 * This is the base Class and it contains 4 methods of return type String and
	 * will not accept any parameter, It extends the SuperDepartment Class.
	 */
	// private data member of HRDepartment class to store the activity details
	private String activity;

	public HRDepartment() {
		/**
		 * @Constructor: This is the default constructor of the HRDepartment Class to
		 *               initialize the properties of super class
		 * @Param: None
		 * @return: Constructor doesn't have the return type
		 */
		/*
		 * re-Initializing the value of departmentName,todaysWork & workDeadline
		 * properties of super class
		 */
		super.departmentName = "HR Department";
		super.todaysWork = "Fill today’s worksheet and mark your attendance";
		super.workDeadline = "Complete by EOD";
		// Initializing the private data member of this class
		this.activity = "team Lunch";
	}

	@Override
	public String departmentName() {
		/**
		 * @Method: overriding super class's method to fetch the department name
		 * @Param: None
		 * @return: String
		 */
		return "Welcome to " + super.departmentName;
	}

	@Override
	public String getTodaysWork() {
		/**
		 * @Method: overriding super class's method to fetch the Today's Work
		 * @Param: None
		 * @return: String
		 */
		return "Today's Work: " + super.todaysWork;
	}

	@Override
	public String getWorkDeadline() {
		/**
		 * @Method: overriding super class's method to fetch the work deadline
		 * @Param: None
		 * @return: String
		 */
		return "Today's Work Deadline: " + super.workDeadline;
	}

	public String doActivity() {
		/**
		 * @Method: method to fetch the activity details
		 * @Param: None
		 * @return: String
		 */
		return "Today's Activity: " + this.activity;
	}
}
