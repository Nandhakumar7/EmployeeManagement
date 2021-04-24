package com.ideas2it.projectManagement.controller;

import java.util.Date;
import java.util.List;

import com.ideas2it.projectManagement.service.impl.ProjectServiceImpl;

/**
 * ProjectController used to for doing CRUD operation.
 *
 * @version  1.0 29-03-2021.
 * @author   Nandhakumar.
 */
public class ProjectController {
    private ProjectServiceImpl projectServiceImpl = new ProjectServiceImpl();
    
    /**
     * project Details are get from user and,
     * insert details to database.
     *
     * @param projectId   Id is for unique for specific prject.       
     * @param managerName  manager of the project.
     * @param projectName  name of the project.
     * @param department   department of the project.
     * @param timePeriod   timeperiod for completing project. 
     *
     * @return isProjectAdded true when sucessfully updated or return false.
     */
    public boolean addProject(int projectId, String projectName,
            String projectManager, String department, int timePeriod) {
        return projectServiceImpl.addProject(projectId, projectName, 
     	        projectManager, department, timePeriod);
    }
	
    /**
     * projectId are get for getting project details.
     *
     * @param projectId    projectId to get that specific project,
     * details from database.
     *
     * @return List   project Details for user View. 
     */
    public List<String> getProjectDetails(int projectId) {
        return projectServiceImpl.getProjectDetails(projectId);
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
        return projectServiceImpl.checkProjectIdExists(projectId);
    }
	
    /**
     * projectId get from user and,
     * Checking Id Already we have or not.
     *
     * @param projectId  For checking whether already we have or not.
     *
     * @return true when Employee ID already Registered or return false.
     */
    public boolean checkProjectIdForCreate(int projectId){
        return projectServiceImpl.checkProjectIdForCreate(projectId);
    }
	
    /**
     * project Details are get from user and,
     * update project details to database.
     *
     * @param projectId    Id is for one which Details need to Change.       
     * @param managerName  new managerName for change.
     * @param projectName  new name for change.
     * @param department   new department for change.
     * @param timePeriod   new DateOfBirth for change.
     *
     * @return isUpdated true when sucessfully updated or return false.
     */
    public boolean updateProject(int projectId, String projectName,
            String managerName, String department, int timePeriod) {
        return projectServiceImpl.updateProject(projectId, projectName,
                managerName, department, timePeriod);
    }
	
    /**
     * projectId are get from user and,
     * remove details from database.
     *
     * @param projectId  for remove that specific project. 
     * 
     * @return isDeleted return true when sucessfully deleted or return false
     */
    public boolean deleteProjectDetails(int projectId) {
        return projectServiceImpl.deleteProjectDetails(projectId);
    }

    /**
     * projectId and employeeId are get from user and,
     * assign project for that employees.
     *
     * @param projectId  for assign that specific project.
     * @employeesId       it contains employees to assign.	 
     * 
     * @return isAssigned return true when sucessfully assigned or return false
     */
    public boolean assignProject(int projectId, List employeesId){
        return projectServiceImpl.assignProject(projectId, employeesId);
    }

    /**
     * projectId and employeeId are get from user and,
     * unassign project for that employees.
     *
     * @param projectId  for unassign that specific project.
     * @param employeesId       it contains employees to unassign.	 
     * 
     * @return isunAssigned return true when sucessfully unassigned or return false
     */
    public boolean unAssignProject(int projectId, List employeesId){
        return projectServiceImpl.unAssignProject(projectId, employeesId);
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
        return projectServiceImpl.checkEmployeeIdExists(employeeId);
    }

    /**
     * Get allProject details from database and send for user view.
     *
     * @return allProject  list contains all project.
     */
    public List getAllProjectDetails() {
        return projectServiceImpl.getAllProjectDetails();
    }
	
    /**
     * projectId get from user and,
     * get list employees already worked in that project.
     *
     * @param projectId  For getting specific project employees..
     *
     * @return List  It contains list of employees assigned and un assigned.
     */
    public List<List> getProjectEmployees(int projectId, List<Integer> employeesId) {
        return projectServiceImpl.getProjectEmployees(projectId, employeesId);
    }
}