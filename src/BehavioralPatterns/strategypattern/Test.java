package strategypattern;

import strategypattern.impl.ContextStrategy;
import strategypattern.impl.ContextStrategyFactory;
import strategypattern.impl.OperationAdd;
import strategypattern.impl.OperationMul;

/**
 * @author HUAWEI
 */
public class Test {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        //这样实际上还是要if-else
        ContextStrategy context1 = new ContextStrategy(new OperationAdd());
        System.out.println("a + b = " + context1.executeStrategy(num1,num2));

        ContextStrategy context2 = new ContextStrategy(new OperationMul());
        System.out.println("a * b = " + context2.executeStrategy(num1,num2));

        String op = "mul";
        //使用工厂模式改进
        ContextStrategyFactory contextStrategyFactory = new ContextStrategyFactory();
        Strategy strategy = contextStrategyFactory.getStrategy(op);
        int ans = strategy.doOperation(num1,num2);
        System.out.println("n1" + op + "n2 =" +ans);

    }
}
