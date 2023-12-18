package structuralpattern.decoratorpattern.impl;

import structuralpattern.decoratorpattern.AbstractBatterCake;


/**
 * 通用装饰器
 * @author HUAWEI
 */
public class BatterCakeDecorator extends AbstractBatterCake{
    private AbstractBatterCake abstractBatterCake;

    public BatterCakeDecorator(AbstractBatterCake abstractBatterCake) {
        this.abstractBatterCake = abstractBatterCake;
    }

    @Override
    public String getMsg() {
        return this.abstractBatterCake.getMsg();
    }

    @Override
    public int getPrice() {
        return this.abstractBatterCake.getPrice();
    }
}
