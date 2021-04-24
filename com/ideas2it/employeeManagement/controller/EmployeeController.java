package com.ideas2it.employeeManagement.controller;

import java.util.Date;
import java.util.List;
import java.util.LinkedList;

import com.ideas2it.employeeManagement.service.impl.EmployeeServiceImpl;

/**
 * EmployeeController used to for doing CRUD operation.
 *
 * @version  1.0 19-03-2021.
 * @author   Nandhakumar.
 */
public class EmployeeController {
    private EmployeeServiceImpl employeeServiceImpl 
            = new EmployeeServiceImpl();
    
    /**
     * Employee Details are get from user and,
     * add Employee details to database.
     *
     * @param employeeId    Specific Id for individual persons.  
     * @param name          Name of employee need to add.
     * @param salary        Salary of employee need to add.
     * @param mobileNumber  MobileNumber of employee need to add.
     * @param dateOfBirth   DateOfBirth of employee need to add.
     * @param addresses     List of employee Addresses.
     *
     * @isEmployeeAdded  return true when added sucessfully or return false. 
     */
    public boolean addEmployeeDetails(int employeeId, String name, float salary, 
            String mobileNumber, Date dateofbirth,
            List<LinkedList<String>> addresses) {
        return employeeServiceImpl.addEmployeeDetails(employeeId, name, salary,
     	        mobileNumber, dateofbirth, addresses);
    }

    /**
     * EmployeeID are get for getting employee details.
     *
     * @param employeeId    EmployeeId to get that specific person,
     * details from employees map. 
     *
     * @return String   Employee Details for user View. 
     */
    public List<String> getEmployeeDetails(int employeeId) {
        return employeeServiceImpl.getEmployeeDetails(employeeId);
    }

    /**
     * EmployeeId get from user and,
     * Checking Id Already we have or not.
     *
     * @param employeeId  For checking whether already we have or not.
     *
     * @return true when Employee ID already Registered or return false.
     */
    public boolean checkEmployeeIdForCreate(int employeeId) {
        return employeeServiceImpl.checkEmployeeIdForCreate(employeeId);
    }

    /**
     * projectId get from user and,
     * Checking Id Already we have or not.
     *
     * @param projectId  For checking whether already we have or not.
     *
     * @return true when projectId already Registered or return false.
     */
    public boolean checkProjectIdExists(int projectId) {
        return employeeServiceImpl.checkProjectIdExists(projectId);
    }

    /**
     * EmployeeId get from user and,
     * Checking Id Already we have or not.
     *
     * @param employeeId  For checking whether already we have or not.
     *
     * @return true when Employee ID already Registered or return false.
     */
    public boolean checkEmployeeIdExists(int employeeId) {
        return employeeServiceImpl.checkEmployeeIdExists(employeeId);
    }
    
    /**
     * Get AllEmployees details from employeesMap and send for user view.
     *
     * @return allEmployees  list contains all employeeDetails.
     */
    public List getAllEmployeeDetails() {
        return employeeServiceImpl.getAllEmployeeDetails();
    }

    /**
     * Check whether given mobilenumber valid or not.
     *
     * @param mobileNumber mobileNumber for validation. 
     *
     * @return true when mobileNumber is valid or return false.
     */
    public boolean validateMobileNumber(String mobileNumber) {
        return employeeServiceImpl.validateMobileNumber(mobileNumber);
    }
    
    /**
     * DateOfBirth are get from user and,
     * Checking DateOfBirth valid or not.
     *
     * @param dateOfBirth. DateOfBirth for validation.
     *
     * @return VaildatedDateOfBirth   If valid DateOfBirth,
     * return DateOfBirth or return null
     */
    public Date getDateOfBirth(String dateOfBirth) {
        return employeeServiceImpl.getDateOfBirth(dateOfBirth);
    }
	
    /**
     * Employee Details are get from user and,
     * update Employee details to Employees map.
     *
     * @param employeeId   Id is for one whose Details need to Change.       
     * @param name         new Name for change.
     * @param salary       new Salary for change.
     * @param mobileNumber new mobileNumber for change.
     * @param dateOfBirth  new DateOfBirth for change.
     *
     * @return isUpdated true when sucessfully updated or return false.	 
     */
    public boolean updateEmployee(int employeeId, String name, float salary,
            String mobileNumber, Date dateOfBirth) {
        return employeeServiceImpl.updateEmployee(employeeId, name, salary,
                mobileNumber, dateOfBirth);
    }

    /**
     * EmployeeID are get from user and,
     * get Employee address details from database.
     *
     * @param employeeId  for get that specific employee address. 
     * @return List  It contains employee Address.
     */
    public List<String> getEmployeeAddress(int employeeId) {
        return employeeServiceImpl.getEmployeeAddress(employeeId);
    }
				
    /**
     * EmployeeID are get from user and,
     * remove Employee details from database.
     *
     * @param employeeId  for remove that specific employee. 
     * 
     * @return isDeleted return true when sucessfully deleted or return false
     */
    public boolean deleteEmployeeDetails(int employeeId) {
        return employeeServiceImpl.deleteEmployeeDetails(employeeId);
    }

    /**
     * Employee Details are get from user and,
     * add Employee address details to database.
     *
     * @param employeeId     Specific Id for individual persons.  
     * @param doorNumber     doorNumber need to change.
     * @param streetName     streetName need to change.
     * @param district       district need to change.
     * @param State          State of need to change.
     * @param country        country need to change.
     * @param pinCode        pinCode need to change.
     * @param choosedAddress old address for update.
     *
     * @return isUpdated true when sucessfully updated or return false.
     */
    public boolean updateAddress(int choosedAddress, int employeeId,
            int doorNumber, String streetName, String district, String State, 
            String Country, int pinCode) {
        return employeeServiceImpl.updateAddress(choosedAddress, employeeId,
                doorNumber, streetName, district, State, Country, pinCode);
    }

   /**
     * Employee Details are get from user and,
     * add Employee address details to database.
     *
     * @param employeeId     Specific Id for individual persons.  
     * @param doorNumber     doorNumber need to change.
     * @param streetName     streetName need to change.
     * @param district       district need to change.
     * @param State          State of need to change.
     * @param country        country need to change.
     * @param pinCode        pinCode need to change.
     * @param choosedAddress old address for update.
     *
     * @return isUpdated true when sucessfully updated or return false.
     */
    public boolean addNewAddress(int employeeId,
            int doorNumber, String streetName, String district, String State, 
            String Country, int pinCode) {
        return employeeServiceImpl.addNewAddress(employeeId,
                doorNumber, streetName, district, State, Country, pinCode);
    }	

    /**
     * update address as a primary address
     * 
     * @choosedAddress  address to update
     * 
     * @return boolean true when sucessfully updated or return false.
     */
    public boolean updateAsPrimaryAddress(int choosedAddress, int employeeId) {
        return employeeServiceImpl.updateAsPrimaryAddress
                (choosedAddress, employeeId);
    }
	
    /**
     * EmployeeID are get from user and,
     * remove Employee address details from database.
     *
     * @param employeeId      for remove that specific employee address.
     * @param choosedAddress  address for remove 
     */	
    public boolean deleteEmployeeAddress(int choosedAddress, int employeeId) {
        return employeeServiceImpl.deleteEmployeeAddress(choosedAddress, employeeId);
    }

    /**
     * projectId and employeeId are get from user and,
     * assign project for that employees.
     *
     * @param employeeId  for assign that specific employee.
     * @param projectsId   it contains projects to assign.	 
     * 
     * @return isAssigned return true when sucessfully assigned or return false
     */
    public boolean assignProject(int employeeId, List projectsId) {
        return employeeServiceImpl.assignProject(employeeId, projectsId);
    }

    /**
     * projectId and employeeId are get from user and,
     * unassign project for that employees.
     *
     * @param employeeId  for unassign that specific employee.
     * @param projectsId   it contains projects to unassign.	 
     * 
     * @return isunAssigned return true when sucessfully unassigned or return false
     */
    public boolean unAssignProject(int employeeId, List projectsId) {
        return employeeServiceImpl.unAssignProject(employeeId, projectsId);
    }

    /**
     * projectId get from user and,
     * get list employees already worked in that project.
     *
     * @param employeeId  For getting specific project employees..
     * @param projectsId  it contains list of projectid.
     *
     * @return List  It contains list of projects assigned and un assigned.
     */
    public List<List> employeeProjects(int employeeId,
            List<Integer> projectsId) {
        return employeeServiceImpl.employeeProjects(employeeId, projectsId);
    }
}