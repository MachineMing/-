package chainofresponsibilitypattern;

/**
 * 抽象Handler
 * @author HUAWEI
 */
public abstract class BaseHandler {
    /**责任链的下一个节点*/
    protected BaseHandler nextHandler;

    public void setNextHandler(BaseHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    /**
     * 处理请求
     * @param request 请求
     */
    public abstract void handleRequest(String request);


    /**
     * 加入建造者模式
     */

    public static class Builder{
        private BaseHandler head;
        private BaseHandler tail;

        public Builder addHandler(BaseHandler handler){
            if (this.head == null) {
                this.head = this.tail = handler;
                return this;
            }
            this.tail.setNextHandler(handler);
            this.tail = handler;
            return this;
        }

        public BaseHandler build(){
            return this.head;
        }

    }
}
