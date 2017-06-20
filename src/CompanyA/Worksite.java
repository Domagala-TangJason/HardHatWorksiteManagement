package CompanyA;

import CompanyA.Exceptions.WorkerException;

import java.lang.reflect.Array;
import java.util.List;
import java.util.ArrayList;

/**
 * Created by Jason on 6/12/2017.
 */
public class Worksite {

    private Long worksiteId;
    private String worksiteLocation;
    private String worksiteDescription;
    private Double totalHoursWorked;
    private CompanyA ownerCompany;

    List<Tasks> taskList = new ArrayList<>();
    Long lastTaskId = 0L;
    List<Employee> workerList;

    public Worksite(
            Long worksiteId, String worksiteLocation, String worksiteDescription, CompanyA company){
        this.worksiteId = worksiteId;
        this.worksiteLocation = worksiteLocation;
        this.worksiteDescription = worksiteDescription;
        ownerCompany = company;
        workerList = new ArrayList<Employee>();

    }

    public Tasks createTasks(
            String taskDescription, String taskStatusDescription, Boolean taskStatus){
        Long myNewId = lastTaskId++;
        Tasks tsk = new Tasks(myNewId, taskDescription, taskStatusDescription, taskStatus);
        taskList.add(tsk);
        return tsk;
    }

    public void addWorker(Employee worker){
                if(!workerList.contains(worker)){
                    workerList.add(worker);
                }
                if(!worker.hasWorksite(this)){
                    worker.addWorksite(this);
                };
    }

    public Long getWorksiteId(){
        return worksiteId;
    }

    public String getWorksiteLocation(){
        return worksiteLocation;
    }

    public String getWorksiteDescription(){
        return worksiteDescription;
    }

    public Double getTotalHoursWorked(){
        return totalHoursWorked;
    }

    public void setWorksiteId(Long worksiteId){
        this.worksiteId = worksiteId;
    }

    public void setWorksiteLocation(String worksiteLocation){
        this.worksiteLocation = worksiteLocation;
    }

    public void setWorksiteDescription(String worksiteDescription){
        this.worksiteDescription = worksiteDescription;
    }

    //TODO make a setter that adds all the total hours worked from employees

    private void setHourTotal() throws WorkerException {
        totalHoursWorked = ownerCompany.getHoursFromWorkers(this);
    }

    @Override
    public String toString(){
        return "\n" +
                "Worksite ID: " + worksiteId +
                "\nWorksite Location: " + worksiteLocation +
                "\nWorksite Description: " + worksiteDescription +
                "\nTasks: " + taskList +
                "\nLast Task ID: " + lastTaskId +
                "}";

    }
}
