package CompanyA;

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
    private Long totalHoursWorked;

    List<Tasks> taskList = new ArrayList<>();
    Long lastTaskId = 0L;

    public Worksite(
            Long worksiteId, String worksiteLocation, String worksiteDescription, Long totalHoursWorked,
            ArrayList taskList){
        this.worksiteId = worksiteId;
        this.worksiteLocation = worksiteLocation;
        this.worksiteDescription = worksiteDescription;
        this.totalHoursWorked = totalHoursWorked;
        this.taskList = taskList;
    }

    public Tasks createTasks(
            Long taskId, String taskDescription, String taskStatusDescription, Boolean taskStatus){
        Long myNewId = lastTaskId++;
        Tasks tsk = new Tasks(myNewId, taskDescription, taskStatusDescription, taskStatus);
        taskList.add(tsk);
        return tsk;
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

    public Long getTotalHoursWorked(){
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
}
