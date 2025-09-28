Prototype Pattern – Game Characters

Problem Statement:
In a game, we often need many similar characters (e.g., many warriors with the same weapon). Creating each one from scratch is repetitive.

Solution:
The Prototype Pattern allows us to clone existing objects instead of building them again.

The GameCharacter interface has a clone() method.

A Warrior can copy itself quickly, giving us a new but separate object.