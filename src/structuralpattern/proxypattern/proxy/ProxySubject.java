package structuralpattern.proxypattern.proxy;

import structuralpattern.proxypattern.ISubject;

/**
 * @author HUAWEI
 */
public class ProxySubject implements ISubject {
    private ISubject subject;

    public ProxySubject(ISubject subject) {
        this.subject = subject;
    }
    public void before(){
        System.out.println("Enhance before operation");
    }
    public void after(){
        System.out.println("Enhance after operation");
    }
    @Override
    public void doOperation() {
        before();
        subject.doOperation();
        after();
    }
}
