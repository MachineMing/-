package statepattern;

import statepattern.impl.ConcreteStateA;
import statepattern.impl.ConcreteStateB;

/**
 * 上下文类
 * @author HUAWEI
 */
public class Context {
    private static final IState STATE_A = new ConcreteStateA();
    private static final IState STATE_B = new ConcreteStateB();
    private IState currentState = STATE_A;

    public void setState(IState state){
        this.currentState = state;
    }
    public void handle(){
        this.currentState.handle();
    }
}
