package strategypattern.impl;

import strategypattern.Strategy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author HUAWEI
 */
public class ContextStrategyFactory {
    private static Map<String,Strategy> strategyMap = new HashMap<String,Strategy>();
    static {
        strategyMap.put("add",new OperationAdd());
        strategyMap.put("sub",new OperationSub());
        strategyMap.put("mul",new OperationMul());
        strategyMap.put("div",new OperationDiv());
    }
    public Strategy getStrategy(String operation){
        Strategy strategy = strategyMap.get(operation);
        if(strategy == null){
            throw new RuntimeException("不存在的策略");
        }
        return strategy;
    }
}
