package CompanyA;

import com.sun.javafx.tk.Toolkit;

/**
 * Created by Jason on 6/14/2017.
 */
public class PlayWithCompany {

    public static void main(String[] args) {

    CompanyA companyA = new CompanyA();

    Employee emp1 = companyA.createEmployee("John","Green",22.25d);
    Employee emp2 = companyA.createEmployee("Connie", "Seitz", 11.36d);

    System.out.println(companyA);

    emp1.setFirstName("Billy");
    System.out.println(emp1);

    Employee emp3 = companyA.createEmployee("Alex", "Kraft", 0.50d);
    emp3.setHourlyPayRate(100d);

    //TODO test the worksite creation and prints

    Worksite wrkst1 = companyA.createWorksite(
            "123 Blue Ave. , Toronto","Building Foundation");
    Worksite wrkst2 = companyA.createWorksite(
            "146 Al Niepodleglsoci, Warsaw Poland", "City general work");

    System.out.println(companyA);

    Tasks tsk1 = wrkst1.createTasks(
            "Dig Hole 6ft down", "2 ft complete so far", false);
    Tasks tsk2 = wrkst2.createTasks(
            "Fill potholes", "Holes identified", false);
    Tasks tsk3 = wrkst1.createTasks(
            "Move bulldozer","Not started", false);
    System.out.println(companyA);

    tsk1.setTaskStatus(true);
    System.out.println(companyA);
    }

}
