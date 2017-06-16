package CompanyA;

/**
 * Created by Jason on 6/12/2017.
 */

//TODO make a list of worksites the employee is working on and worker relations
public class Employee {

    private Long employeeId;
    private String firstName;
    private String lastName;
    private Double hourlyPayRate;

    public Employee(Long employeeId, String firstName, String lastName, Double hourlyPayRate) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.hourlyPayRate = hourlyPayRate;
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
