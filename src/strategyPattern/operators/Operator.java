package strategyPattern.operators;

import strategyPattern.interfaces.Strategy;

public class Operator {
    private Strategy strategy;

    public Operator(Strategy strategy) {
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2) {
        return strategy.evaluate(num1, num2);
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
}
