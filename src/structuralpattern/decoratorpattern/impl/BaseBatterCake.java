package structuralpattern.decoratorpattern.impl;

import structuralpattern.decoratorpattern.AbstractBatterCake;

public class BaseBatterCake extends AbstractBatterCake {
    @Override
    public String getMsg() {
        return "煎饼";
    }

    @Override
    public int getPrice() {
        return 5;
    }
}
