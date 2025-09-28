package Behavioral.Interpreter;

public class InterpreterDemo {
    public static void main(String[] args) {
        RobotInterpreter.interpret("MOVE 5");
        RobotInterpreter.interpret("TURN LEFT");
        RobotInterpreter.interpret("MOVE 3");
        RobotInterpreter.interpret("TURN RIGHT");
    }
}
