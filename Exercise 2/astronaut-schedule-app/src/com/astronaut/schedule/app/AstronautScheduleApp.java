package com.astronaut.schedule.app;

import com.astronaut.schedule.model.Task;
import com.astronaut.schedule.factory.TaskFactory;
import com.astronaut.schedule.manager.ScheduleManager;
import com.astronaut.schedule.observer.ConflictNotifier;

import java.util.Scanner;

public class AstronautScheduleApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ScheduleManager manager = ScheduleManager.getInstance();
        manager.addObserver(new ConflictNotifier());

        while (true) {
            System.out.println();
            System.out.println("--- Astronaut Daily Schedule ---");
            System.out.println("1. Add Task");
            System.out.println("2. Remove Task");
            System.out.println("3. View All Tasks");
            System.out.println("4. View Tasks by Priority");
            System.out.println("5. Mark Task as Completed");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");

            String choiceStr = scanner.nextLine();
            int choice;
            try {
                choice = Integer.parseInt(choiceStr.trim());
            } catch (NumberFormatException e) {
                System.out.println("Invalid option! Enter a number between 1 and 6.");
                continue;
            }

            switch (choice) {
                case 1:
                    System.out.print("Description: ");
                    String desc = scanner.nextLine().trim();
                    System.out.print("Start Time (HH:MM): ");
                    String start = scanner.nextLine().trim();
                    System.out.print("End Time (HH:MM): ");
                    String end = scanner.nextLine().trim();
                    System.out.print("Priority (High/Medium/Low): ");
                    String priority = scanner.nextLine().trim();

                    Task task = TaskFactory.createTask(desc, start, end, priority);
                    manager.addTask(task);
                    break;

                case 2:
                    System.out.print("Enter task description to remove: ");
                    manager.removeTask(scanner.nextLine().trim());
                    break;

                case 3:
                    manager.viewTasks();
                    break;

                case 4:
                    System.out.print("Enter priority (High/Medium/Low): ");
                    manager.viewTasksByPriority(scanner.nextLine().trim());
                    break;

                case 5:
                    System.out.print("Enter task description to mark completed: ");
                    manager.markTaskCompleted(scanner.nextLine().trim());
                    break;

                case 6:
                    System.out.println("Exiting... Safe journey astronaut!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid option! Try again.");
            }
        }
    }
}
