package Employees;

/**
 * Created by Jason on 6/12/2017.
 */

//TODO make a list of worksites the employee is working on and worker relations
public class Employee {

    private Long employeeId;
    private String firstName;
    private String lastName;
    private Long hoursWorked;
    private Long hourlyPayRate;

    public Employee(Long employeeId, String firstName, String lastName, Long hourlyPayRate, Long hoursWorked){
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.hourlyPayRate = hourlyPayRate;
        this.hoursWorked = hoursWorked;
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

    public Long getHoursWorked(){
        return hoursWorked;
    }

    public Long getHourlyPayRate(){
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

    public void addHoursWorked(Long hoursWorked){
        this.hoursWorked = this.hoursWorked + hoursWorked;
    }

    public void resetHoursWorked(Long a){
        a = Long.valueOf(0);
        this.hoursWorked = a;
    }

    public void setHourlyPayRate (Long hourlyPayRate){
        this.hourlyPayRate = hourlyPayRate;
    }
    //TODO override the prointouts
}
