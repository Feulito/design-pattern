package strategyPattern;

import strategyPattern.operators.AddOperator;
import strategyPattern.operators.MultyplyOperator;
import strategyPattern.operators.Operator;
import strategyPattern.operators.SubstractOperator;

/**
 * L'interet du patron de conception Strategy est de proposer plusieurs comportement possible
 * pour un objet.
 * Le comportement adopté par l'objet sera détérminé par la stratégie qu'on lui donne
 * Ainsi le comportement d'un objet, avec le strategy design pattern, peut changer
 * en temps réel.
 */
public class StrategyPatternDemo {
    public static void main(String[] args) {
        Operator operator = new Operator(new AddOperator());
        int addResult = operator.executeStrategy(1,5);

        operator.setStrategy(new SubstractOperator());
        int substractResult = operator.executeStrategy(1,5);

        operator.setStrategy(new MultyplyOperator());
        int multiplyResult = operator.executeStrategy(1,5);

        System.out.println("1 + 5 = " + addResult);
        System.out.println("1 - 5 = " + substractResult);
        System.out.println("1 * 5 = " + multiplyResult);
    }
}
