package chainofresponsibilitypattern;

import chainofresponsibilitypattern.impl.ConcreteHandlerA;
import chainofresponsibilitypattern.impl.ConcreteHandlerB;

/**
 * @author HUAWEI
 */
public class Test {
    public static void main(String[] args) {
//        BaseHandler handlerA = new ConcreteHandlerA();
//        BaseHandler handlerB = new ConcreteHandlerB();
//        handlerA.setNextHandler(handlerB);
        String request = "requestB";
//        handlerA.handleRequest(request);
        BaseHandler.Builder builder = new BaseHandler.Builder();
        builder.addHandler(new ConcreteHandlerA())
                .addHandler(new ConcreteHandlerB())
                .build().handleRequest(request);
    }
}
