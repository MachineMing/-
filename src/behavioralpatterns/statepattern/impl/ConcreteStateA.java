package statepattern.impl;

import statepattern.IState;

/**
 * 具体状态类
 * @author HUAWEI
 */
public class ConcreteStateA implements IState {
    @Override
    public void handle() {
        System.out.println("State-A");
    }
}
