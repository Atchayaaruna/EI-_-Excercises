package com.astronaut.schedule.observer;

import com.astronaut.schedule.model.Task;

public interface TaskObserver {
    void notifyConflict(Task newTask, Task existingTask);
}
