package CompanyA;

import Employees.Employee;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jason on 6/12/2017.
 */
public class CompanyA {

    List<Employee> employeeList = new ArrayList<>();
    List<Worksite> worksiteList = new ArrayList<>();
    Long lastEmployeeId = 0L;
    Long lastWorksiteId = 0L;

    public Employee createEmployee(
            String firstName, String lastName, Long hourlyPayRate, Long hoursWorked){
        Long myNewId = lastEmployeeId++;
        Employee em = new Employee(myNewId, firstName,lastName, hourlyPayRate, hoursWorked);
        employeeList.add(em);
        return em;
    }

    public Worksite createWorksite(
            String worksiteLocation, String worksiteDescription, Long totalHoursWorked, ArrayList taskList){
        Long myNewId = lastWorksiteId++;
        Worksite ws = new Worksite(myNewId, worksiteLocation, worksiteDescription, totalHoursWorked, taskList);
        worksiteList.add(ws);
        return ws;
        }
    }
