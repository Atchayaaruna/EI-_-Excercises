package com.astronaut.schedule.observer;

import com.astronaut.schedule.model.Task;

public class ConflictNotifier implements TaskObserver {
    @Override
    public void notifyConflict(Task newTask, Task existingTask) {
        System.out.println("Error: Task conflicts with existing task \"" + existingTask.getDescription() + "\".");
    }
}
