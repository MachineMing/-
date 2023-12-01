package strategypattern.impl;

import strategypattern.Strategy;

/**
 * @author HUAWEI
 */
public class ContextStrategy {

    private final Strategy strategy;

    public ContextStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
    public int executeStrategy(int num1,int num2){
        return strategy.doOperation(num1,num2);
    }
}
