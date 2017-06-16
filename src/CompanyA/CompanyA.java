package CompanyA;

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
            String firstName, String lastName, Double hourlyPayRate){
        Long myNewId = lastEmployeeId++;
        Employee em = new Employee(myNewId, firstName,lastName, hourlyPayRate);
        employeeList.add(em);
        return em;
    }

    public Worksite createWorksite(
            String worksiteLocation, String worksiteDescription){
        Long myNewId = lastWorksiteId++;
        Worksite ws = new Worksite(myNewId, worksiteLocation, worksiteDescription);
        worksiteList.add(ws);
        return ws;
        }

    //TODO delete employee/worksite, assign empoloyee,

    @Override
    public String toString(){
        return "CompanyA{ " +
                "\nEmployees: " + employeeList +
                "\nWorksites: " + worksiteList +
                "\nLast Employee ID: " + lastEmployeeId +
                "\nLast Worksite ID: " + lastWorksiteId +
                "}";
    }

}
