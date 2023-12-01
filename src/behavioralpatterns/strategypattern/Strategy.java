package strategypattern;


/**
 * @author HUAWEI
 */
public interface Strategy {
    /**
     * 抽象方法
     * @param num1 参数一
     * @param num2 参数二
     * @return 返回值
     */
    int doOperation(int num1,int num2);
}
