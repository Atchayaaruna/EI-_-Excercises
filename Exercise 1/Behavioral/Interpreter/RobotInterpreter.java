package Behavioral.Interpreter;

public class RobotInterpreter {
    public static void interpret(String command) {
        String[] parts = command.split(" ");

        if (parts[0].equalsIgnoreCase("MOVE")) {
            new MoveExpression(Integer.parseInt(parts[1])).interpret();
        } else if (parts[0].equalsIgnoreCase("TURN")) {
            new TurnExpression(parts[1]).interpret();
        } else {
            System.out.println("Unknown command: " + command);
        }
    }
}
