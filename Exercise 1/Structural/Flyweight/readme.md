Flyweight Pattern – Forest of Trees

Problem Statement:
If we draw thousands of trees in a forest, creating a new object for each tree wastes memory, since many trees look the same (same type and color).

Solution:
The Flyweight Pattern reuses objects with the same state.

TreeFactory stores and reuses TreeType objects.

When we draw trees with the same type/color, they share the same object.

Saves memory while still drawing correctly.