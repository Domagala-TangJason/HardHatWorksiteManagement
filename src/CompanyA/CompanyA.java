package CompanyA;

import CompanyA.Exceptions.WorkerException;
import CompanyA.Exceptions.WorksiteException;
import com.sun.xml.internal.ws.api.pipe.FiberContextSwitchInterceptor;

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
        Employee em = new Employee(myNewId, firstName,lastName, hourlyPayRate,this);
        employeeList.add(em);
        return em;
    }

    public Worksite createWorksite(
            String worksiteLocation, String worksiteDescription){
        Long myNewId = lastWorksiteId++;
        Worksite ws = new Worksite(myNewId, worksiteLocation, worksiteDescription,this);
        worksiteList.add(ws);
        return ws;
        }

    //TODO delete employee/worksite, assign empoloyee,

    public double getHoursFromWorkers(Worksite worksiteRequested) throws WorkerException {
        double totalHours = 0;
        for (Employee worker : employeeList) {
            if (worker.hasWorksite(worksiteRequested)) {
                totalHours += worker.getHoursAtWorksite(worksiteRequested);
                throw new WorkerException("Worker ID: " + worker + " not founds!");
            }
        }
        return totalHours;
    }

    public void deleteEmployee(Employee em){
                employeeList.remove(em);
    }

   /* private Employee findEmployeeById(Long EmpId) {
        for (Employee em : employeeList)
            if (em.getEmployeeId().equals(EmpId))
                return em;
        //find employee exceptions 
    }
*/


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
