package com.greatlearning.app;

//Importing all the required Modules 
import com.greatlearning.services.DisplayServices;
import com.greatlearning.model.AdminDepartment;
import com.greatlearning.model.HRDepartment;
import com.greatlearning.model.TechDepartment;

/**
 * @author Rahul Dubey
 * @Last Updated: 27/03/2022
 *
 */
public class Main {
	/**
	 * This is the Driver class responsible for driving the execution Process and
	 * utilizing the services provided by each model class
	 * 
	 */
	public Main() {
		/**
		 * @Constructor: This is the default constructor of the Main Class
		 * @Param: None
		 * @return: Constructor doesn't have the return type
		 *
		 */
	}

	public static void main(String[] args) {
		/**
		 * @Main Method: The Starting point of the application and to create the objects
		 *       of the required modules
		 * @param : String array to hold the variable length CLI arguments
		 * @return: None
		 */

		// Creating objects of all the modules
		DisplayServices service = new DisplayServices();
		AdminDepartment admin = new AdminDepartment();
		HRDepartment hr = new HRDepartment();
		TechDepartment tech = new TechDepartment();

		// Calling the display services respective to their modules
		service.displayAdmin(admin);
		service.displayHR(hr);
		service.displayTech(tech);

	}

}
