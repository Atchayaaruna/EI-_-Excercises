Composite Pattern – Company Hierarchy

Problem Statement:
In a company, managers can have developers working under them, and managers themselves can report to other managers. Representing this tree-like structure is tricky if we treat employees differently.

Solution:
The Composite Pattern treats individuals (Developers) and groups (Managers) the same way.

Both implement the Employee interface.

A manager can hold a list of employees (which may be developers or other managers).

Printing details works the same way for all.