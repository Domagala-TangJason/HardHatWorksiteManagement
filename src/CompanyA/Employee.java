package CompanyA;

import com.sun.xml.internal.ws.api.pipe.FiberContextSwitchInterceptor;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jason on 6/12/2017.
 */

//TODO make a list of worksites the employee is working on and worker relations
public class Employee {

    private Long employeeId;
    private String firstName;
    private String lastName;
    private Double hourlyPayRate;
    private List<Worksite> myWorksites;
    private CompanyA myEmployer;
    private List<Double> hoursWorked;

    public Employee(Long employeeId, String firstName, String lastName, Double hourlyPayRate, CompanyA employer) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.hourlyPayRate = hourlyPayRate;
        myEmployer = employer;
        hoursWorked = new ArrayList<>();
        myWorksites = new ArrayList<Worksite>();
    }

    public Long getEmployeeId() {
        return employeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public Double getHourlyPayRate(){
        return hourlyPayRate;
    }

    public void setEmployeeId(Long employeeId){
        this.employeeId = employeeId;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public void setHourlyPayRate (Double hourlyPayRate){
        this.hourlyPayRate = hourlyPayRate;
    }

    public boolean hasWorksite(Worksite siteToCheck){
        if(myWorksites.contains(siteToCheck)){
                return true;
            } else return false;
        }

    public void addWorksite(Worksite newPlace){
        myWorksites.add(newPlace);
        hoursWorked.add(0D);
        //since the hours worked and new workplace are made in pairs and at the same time, the same index # can be used
        newPlace.addWorker((this));
    }

    public void logHours(int hours, Worksite placeOfWork){
        int matchingSlotOfWorksite = myWorksites.indexOf(placeOfWork);
        double previousTotal = hoursWorked.get(matchingSlotOfWorksite);
        hoursWorked.set(matchingSlotOfWorksite, hours + previousTotal);
    }

    public double getHoursAtWorksite(Worksite specifiedSite){
        int matchingSlotOfWorksite = myWorksites.indexOf(specifiedSite);
        return hoursWorked.get(matchingSlotOfWorksite);
    }
    //TODO override the printouts
    @Override
    public String toString(){
        return "\n{Employee ID: " + employeeId +
                "\nFirst Name: " + firstName +
                "\nLast Name: " + lastName +
                "\nPay Rate: $" + hourlyPayRate + "/hour." +
                "}";
    }
}
