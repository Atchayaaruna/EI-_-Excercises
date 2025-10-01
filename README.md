# EI_Excercises
Exercise 1:

Behavioral:  “How objects communicate and handle responsibilities.”

Interpreter → Turn text commands into actions (example: a robot following commands).

Memento → Save and go back to an earlier state (example: undo in a text editor).

Creational:   “How objects are created step by step or by cloning.”

Prototype → Make copies instead of building from scratch (example: game characters).

Builder → Build something step by step (example: custom computers).

Structural:   “How objects are combined or connected to form bigger structures.”

Flyweight → Share objects to save memory (example: lots of trees in a forest).

Composite → Treat one item or a group the same way (example: a company’s hierarchy).

Exercise 2:

Overview — Astronaut Schedule Organizer

The Astronaut Schedule Organizer is a console-based Java application designed to help astronauts plan, manage, and track their daily activities. The application ensures tasks are scheduled efficiently, avoids overlaps, and keeps priorities in check — all in a simple, clean interface.

Key Features:

Add a Task:
Input task description, start time, end time, and priority.
Automatically validates time format and checks for scheduling conflicts.

Remove a Task:
Delete an existing task by description.

View Tasks:
Display all tasks in chronological order.
View tasks by priority.

Mark Task as Completed:
Track progress by marking tasks as completed.

Conflict Notifications:
Automatically alerts if a new task overlaps with existing tasks.

Design Highlights:
The project uses three important design patterns for maintainability, scalability, and clarity:

Singleton Pattern → Ensures a single ScheduleManager instance manages all tasks.

Factory Pattern → Centralizes task creation through TaskFactory, simplifying object creation logic.

Observer Pattern → Decouples conflict detection and notification via TaskObserver and ConflictNotifier.
