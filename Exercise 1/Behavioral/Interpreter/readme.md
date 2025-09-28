Interpreter Pattern – Robot Commands

Problem Statement:
Robots need to follow simple text commands like “MOVE 5” or “TURN LEFT”. Writing if/else for every possible command quickly becomes messy.

Solution:
The Interpreter Pattern lets us translate simple text into actions.

Each command (like MoveExpression, TurnExpression) knows how to interpret itself.

The RobotInterpreter acts as a parser to read commands and run them.