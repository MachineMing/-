package structuralpattern.decoratorpattern;

import structuralpattern.decoratorpattern.impl.BaseBatterCake;
import structuralpattern.decoratorpattern.impl.BatterCakeDecorator;
import structuralpattern.decoratorpattern.impl.EggDecorator;

public class Test {
    public static void main(String[] args) {
        AbstractBatterCake batterCake;
        batterCake = new BaseBatterCake();
        batterCake = new EggDecorator(batterCake);
        System.out.println(batterCake.getMsg()+" 总价："+batterCake.getPrice());
    }
}
