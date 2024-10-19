import java.util.Scanner;

class Task {
    private String description;
    private boolean isCompleted;

    Task(String description) {
        this.description = description;
        // we need to make the isCompleted as false for every object
        // As we know the boolean datatype's default value id false, we need not specify
        // or modify it seperately
    }

    public String getDescription() {
        return description;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    void markCompleted() {
        isCompleted = true;
    }

    public String toString() {
        return "Task Description= " + this.description + "\n Completed Status = " + this.isCompleted;
    }
}

class TaskManager {
    Task task[];
    int taskCount;

    TaskManager(int intialCapacity) {
        task = new Task[intialCapacity];
    }

    void addTask(String description) {
        if (taskCount == task.length) {
            // we are out of space in array.
            System.out.println("Task List is Full");
        } else {
            Task t = new Task(description);
            task[taskCount] = t;
            taskCount++;
            System.out.println("Task added sucessfully");
            System.out.println();
        }
    }

    void markTaskCompleted(int index) {
        task[index].markCompleted();
        System.out.println("Task completed status updated...");
    }

    void listPendingTasks() {
        for (int i = 0; i < task.length; i++) {
            if (!task[i].isCompleted()) {
                System.out.println(task[i]);
            }
            if (task[i + 1] == null)
                break;
        }
    }

    void listCompletedTasks() {
        for (int i = 0; i < task.length; i++) {
            if (task[i].isCompleted()) {
                System.out.println(task[i]);
            }
            if (task[i + 1] == null)
                break;
        }
    }

    void listAllTasks() {
        for (int i = 0; i < taskCount; i++) {
            System.out.println(task[i]);
        }
    }
}

public class TaskManagerProject {
    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager(10);
        boolean isExit = false;
        Scanner scanner = new Scanner(System.in);
        while (!isExit) {
            System.out.println("Task Manager Menu");
            System.out.println("1. Add Task");
            System.out.println("2. Mark Task Completed");
            System.out.println("3. List Pending Tasks");
            System.out.println("4. List Completed Tasks");
            System.out.println("5. List All Tasks");
            System.out.println("6. Exit");
            System.out.println();
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Enter the task info : ");
                    String taskInfo = scanner.next();
                    taskManager.addTask(taskInfo);
                    break;
                case 2:
                    System.out.println("Enter the task number : ");
                    int index = scanner.nextInt();
                    taskManager.markTaskCompleted(index);
                    break;
                case 3:
                    taskManager.listPendingTasks();
                    break;
                case 4:
                    taskManager.listCompletedTasks();
                    break;
                case 5:
                    taskManager.listAllTasks();
                    break;
                case 6:
                    isExit = true;
                    break;
                case 7:
                    System.out.println("Enter the valid input value....");
            }
        }
        // taskManager.addTask("I want to complete java arrays");
        // taskManager.addTask("I want to complete java collections");
        // taskManager.markTaskCompleted(1);
        // taskManager.listPendingTasks();
        // taskManager.listCompletedTasks();
        // taskManager.listAllTasks();
    }
}