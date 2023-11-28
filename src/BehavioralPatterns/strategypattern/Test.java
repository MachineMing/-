package strategypattern;

import strategypattern.impl.ContextStrategy;
import strategypattern.impl.OperationAdd;

/**
 * @author HUAWEI
 */
public class Test {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        ContextStrategy context = new ContextStrategy(new OperationAdd());
        System.out.println("a + b = " + context.executeStrategy(num1,num2));
    }
}
