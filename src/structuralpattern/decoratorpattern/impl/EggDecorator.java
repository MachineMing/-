package structuralpattern.decoratorpattern.impl;

import structuralpattern.decoratorpattern.AbstractBatterCake;

/**
 * 针对性装饰器
 * @author HUAWEI
 */
public class EggDecorator extends BatterCakeDecorator{
    public EggDecorator(AbstractBatterCake baseBatterCake) {
        super(baseBatterCake);
    }

    @Override
    public String getMsg() {
        return super.getMsg()+" 加一个1个鸡蛋";
    }

    @Override
    public int getPrice() {
        return super.getPrice()+1;
    }
}
