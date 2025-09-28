Builder Pattern – Custom Computers

Problem Statement:
When creating a computer, there are many options (CPU, RAM, Storage). If we try to pass everything into a constructor, it becomes confusing and hard to read.

Solution:
The Builder Pattern creates objects step by step.

ComputerBuilder lets us set CPU, RAM, and Storage one by one.

build() returns the final immutable Computer object.

This makes the code readable and flexible.