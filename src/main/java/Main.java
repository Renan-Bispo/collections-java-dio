import list.BasicOperations.ListTask;

public class Main {
    public static void main(String[] args) {
        ListTask listTask = new ListTask();

        System.out.println("numero de tarefas: " + listTask.numberOfTasks());

        listTask.addTask("tarefa 1");
        listTask.addTask("tarefa 1");
        listTask.addTask("tarefa 2");
        System.out.println("numero de tarefas: " + listTask.numberOfTasks());

        listTask.removeTask("tarefa 2");
        System.out.println("numero de tarefas: " + listTask.numberOfTasks());

        listTask.descriptionOfTasks();
    }
}
