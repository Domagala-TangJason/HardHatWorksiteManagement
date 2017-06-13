package CompanyA;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jason on 6/12/2017.
 */
public class Tasks {
    private Long taskId;
    private String taskDescription;
    private String taskStatusDescription;
    private Boolean taskStatus;
    // true will mean that the task has been complete, false means it has not been

//TODO make tasks into array

    public Tasks (
            Long taskId, String taskDescription, String taskStatusDescription, Boolean taskStatus){
        this.taskId = taskId;
        this.taskDescription = taskDescription;
        this.taskStatusDescription = taskStatusDescription;
        this.taskStatus = taskStatus;
    }

    public String getTaskDescription(){
        return taskDescription;
    }

    public String getTaskStatusDescription(){
        return taskStatusDescription;
    }

    public Boolean getTaskStatus(){
        return taskStatus;
    }

    public Long getTaskId(){
        return taskId;
    }

    public void setTaskDescription(String taskDescription){
        this.taskDescription = taskDescription;
    }

    public void setTaskStatusDescription(String taskStatusDescription){
        this.taskStatusDescription = taskStatusDescription;
    }

    public void setTaskStatus(Boolean taskStatus){
        this.taskStatus = taskStatus;
    }

    public void setTaskId(Long taskId){
        this.taskId = taskId;
    }
}
