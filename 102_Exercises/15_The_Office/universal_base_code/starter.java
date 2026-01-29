/*
 *	Author:
 *  Date:
 * 	Collaborator(s):
*/
import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Employee michael = new Employee();
		michael.employeeToString();
		
		Employee dwight = new Employee(1987, "Dwight", "Shrute", 4416.66);
		dwight.employeeToString();
		
		Employee jim = new Employee(1987, "Jim", "Halpert", 4416.66);
		jim.employeeToString();
		
		Employee pam = new Employee(1987, "Pam", "Beesly", 4416.66);
		pam.employeeToString();
		
		Employee enzo = new Employee(6767, "Enzo", "The Nut", 6767.67);
		enzo.employeeToString();
		
		michael.raiseSalary(13);
		michael.employeeToString();
		System.out.println("Annual Salary = " + michael.getAnnualSalary());
		
		dwight.raiseSalary(4067);
		dwight.employeeToString();
		System.out.println("Annual Salary = " + dwight.getAnnualSalary());
		
		jim.raiseSalary(5);
		jim.employeeToString();
		System.out.println("Annual Salary = " + jim.getAnnualSalary());
		
		pam.raiseSalary(-67676767);
		pam.employeeToString();
		System.out.println("Annual Salary = " + pam.getAnnualSalary());
		
		enzo.raiseSalary(-67);
		enzo.employeeToString();
		System.out.println("Annual Salary = " + enzo.getAnnualSalary());
	}
}
