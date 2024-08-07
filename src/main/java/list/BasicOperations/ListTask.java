package list.BasicOperations;

import java.util.ArrayList;
import java.util.List;

public class ListTask {
    private List<Task> taskList;

    public ListTask() {
        this.taskList = new ArrayList<>();
    }

    public void addTask(String description){
        taskList.add(new Task(description));
    }

    public void removeTask(String description){
        List<Task> tasksToRemove = new ArrayList<>();
        for (Task t: taskList) {
            if (t.getDescription().equalsIgnoreCase(description)){
                tasksToRemove.add(t);
            }
        }
        taskList.removeAll(tasksToRemove);
    }

    public int numberOfTasks(){
        return taskList.size();
    }

    public void descriptionOfTasks(){
        System.out.println(taskList);
    }
}
