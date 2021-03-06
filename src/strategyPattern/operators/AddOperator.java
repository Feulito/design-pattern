package strategyPattern.operators;

import strategyPattern.interfaces.Strategy;

public class AddOperator implements Strategy {
    @Override
    public int evaluate(int num1, int num2) {
        return num1 + num2;
    }
}
