package Behavioral.Interpreter;

public class MoveExpression implements Expression {
    private int steps;

    public MoveExpression(int steps) {
        this.steps = steps;
    }

    @Override
    public void interpret() {
        System.out.println("Robot moves " + steps + " steps forward.");
    }
}
