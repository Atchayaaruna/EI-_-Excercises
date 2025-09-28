package Behavioral.Interpreter;

public class TurnExpression implements Expression {
    private String direction;

    public TurnExpression(String direction) {
        this.direction = direction;
    }

    @Override
    public void interpret() {
        System.out.println("Robot turns " + direction + ".");
    }
}
