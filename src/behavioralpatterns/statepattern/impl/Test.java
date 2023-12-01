package statepattern.impl;

import statepattern.Context;

/**
 * @author HUAWEI
 */
public class Test {
    public static void main(String[] args) {
        Context context = new Context();
        context.handle();
        context.setState(new ConcreteStateB());
        context.handle();
    }
}
