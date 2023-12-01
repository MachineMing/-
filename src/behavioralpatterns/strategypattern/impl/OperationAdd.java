package strategypattern.impl;

import strategypattern.Strategy;

/**
 * @author HUAWEI
 */
public class OperationAdd implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 + num2;
    }
}
