package com.astronaut.schedule.manager;

import com.astronaut.schedule.model.Task;
import com.astronaut.schedule.observer.TaskObserver;

import java.util.*;

public class ScheduleManager {
    private static ScheduleManager instance;
    private List<Task> tasks;
    private List<TaskObserver> observers;

    private ScheduleManager() {
        tasks = new ArrayList<>();
        observers = new ArrayList<>();
    }

    public static ScheduleManager getInstance() {
        if (instance == null) {
            instance = new ScheduleManager();
        }
        return instance;
    }

    public void addObserver(TaskObserver observer) {
        observers.add(observer);
    }

    private void notifyObservers(Task newTask, Task conflictTask) {
        for (TaskObserver observer : observers) {
            observer.notifyConflict(newTask, conflictTask);
        }
    }

    private boolean isValidTime(String time) {
        return time != null && time.matches("([01]\\d|2[0-3]):[0-5]\\d");
    }

    private boolean isOverlapping(Task t1, Task t2) {
        boolean noOverlap = t1.getEndTime().compareTo(t2.getStartTime()) <= 0 ||
                            t1.getStartTime().compareTo(t2.getEndTime()) >= 0;
        return !noOverlap;
    }

    public void addTask(Task task) {
        if (!isValidTime(task.getStartTime()) || !isValidTime(task.getEndTime())) {
            System.out.println("Error: Invalid time format.");
            return;
        }

        if (task.getStartTime().compareTo(task.getEndTime()) >= 0) {
            System.out.println("Error: Start time must be before end time.");
            return;
        }

        for (Task t : tasks) {
            if (isOverlapping(task, t)) {
                notifyObservers(task, t);
                return;
            }
        }

        tasks.add(task);
        tasks.sort(Comparator.comparing(Task::getStartTime));
        System.out.println("Task added successfully. No conflicts.");
    }

    public void removeTask(String description) {
        Optional<Task> taskToRemove = tasks.stream()
                .filter(t -> t.getDescription().equalsIgnoreCase(description))
                .findFirst();
        if (taskToRemove.isPresent()) {
            tasks.remove(taskToRemove.get());
            System.out.println("Task removed successfully.");
        } else {
            System.out.println("Error: Task not found.");
        }
    }

    public void viewTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks scheduled for the day.");
            return;
        }
        for (Task t : tasks) {
            System.out.println(t.toString());
        }
    }

    public void viewTasksByPriority(String priority) {
        boolean found = false;
        for (Task t : tasks) {
            if (t.getPriority().equalsIgnoreCase(priority)) {
                System.out.println(t.toString());
                found = true;
            }
        }
        if (!found) {
            System.out.println("No tasks found with priority: " + priority);
        }
    }

    public void markTaskCompleted(String description) {
        for (Task t : tasks) {
            if (t.getDescription().equalsIgnoreCase(description)) {
                t.markCompleted();
                System.out.println("Task marked as completed.");
                return;
            }
        }
        System.out.println("Error: Task not found.");
    }
}
