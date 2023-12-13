package structuralpattern.proxypattern.impl;

import structuralpattern.proxypattern.ISubject;

/**
 * @author HUAWEI
 */
public class RealSubject implements ISubject {
    @Override
    public void doOperation() {
        System.out.println("RealSubject do operation.");
    }
}
