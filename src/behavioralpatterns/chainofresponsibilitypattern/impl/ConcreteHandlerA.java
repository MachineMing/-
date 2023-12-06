package chainofresponsibilitypattern.impl;

import chainofresponsibilitypattern.BaseHandler;

/**
 * @author HUAWEI
 */
public class ConcreteHandlerA extends BaseHandler {
    private static String requestA = "requestA";

    @Override
    public void handleRequest(String request) {
        if(requestA.equals(request)){
            System.out.println(this.getClass().getSimpleName() + " deal with " + request);
            //当前节点处理完则停止
            return;
        }
        //未处理完成则移交给下一个节点
        if(this.nextHandler != null){
            this.nextHandler.handleRequest(request);
        }
    }
}
