
package com.greatlearning.services;

import com.greatlearning.model.AdminDepartment;
import com.greatlearning.model.HRDepartment;
import com.greatlearning.model.TechDepartment;

/**
 * @author Rahul Dubey
 * @Last Updated: 27/03/2022
 *
 */
public class DisplayServices {

	/*
	 * This is the base Class and it contains 3 methods of return type void and will
	 * not accept any parameter, It calls all department methods as a service.
	 */

	public DisplayServices() {
		/**
		 * @Constructor: This is the default constructor of the DisplayServices Class
		 * @Param: None
		 * @return: Constructor doesn't have the return type
		 */

	}

	public void displayAdmin(AdminDepartment admin) {
		/**
		 * @Method:to display all the functionality of AdminDepartment class
		 * @Param: AdminDepartment object
		 * @return: void
		 */
		// printing a new line
		System.out.println();
		/*
		 * Calling all the overridden methods of AdminDepartment class like
		 * departmentName(),getTodaysWork(),getWorkDeadline()
		 */
		System.out.println(admin.departmentName());
		System.out.println(admin.getTodaysWork());
		System.out.println(admin.getWorkDeadline());
		/*
		 * Calling isTodayAHoliday() method of SuperDepartment with reference to
		 * AdminDepartment object
		 */
		System.out.println(admin.isTodayAHoliday());
		// printing a new line
		System.out.println();

	}

	public void displayHR(HRDepartment hr) {
		/**
		 * @Method:to display all the functionality of HRDepartment class
		 * @Param: HRDepartment object
		 * @return: void
		 */
		// printing a new line
		System.out.println();
		/*
		 * Calling all the overridden methods of HRDepartment class like
		 * departmentName(),getTodaysWork(),getWorkDeadline()
		 */
		System.out.println(hr.departmentName());
		System.out.println(hr.doActivity());
		System.out.println(hr.getTodaysWork());
		System.out.println(hr.getWorkDeadline());
		/*
		 * Calling isTodayAHoliday() method of SuperDepartment with reference to
		 * HRDepartment object
		 */
		System.out.println(hr.isTodayAHoliday());
		// printing a new line
		System.out.println();

	}

	public void displayTech(TechDepartment tech) {
		/**
		 * @Method:to display all the functionality of TechDepartment class
		 * @Param: TechDepartment object
		 * @return: void
		 */
		// printing a new line
		System.out.println();
		/*
		 * Calling all the overridden methods of TechDepartment class like
		 * departmentName(),getTodaysWork(),getWorkDeadline()
		 */
		System.out.println(tech.departmentName());
		System.out.println(tech.getTodaysWork());
		System.out.println(tech.getWorkDeadline());
		System.out.println(tech.getTechStackInformation());
		/*
		 * Calling isTodayAHoliday() method of SuperDepartment with reference to
		 * TechDepartment object
		 */
		System.out.println(tech.isTodayAHoliday());
		// printing a new line
		System.out.println();
	}

}
