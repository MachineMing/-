package structuralpattern.proxypattern;

import structuralpattern.proxypattern.impl.RealSubject;
import structuralpattern.proxypattern.impl.RealSubject2;
import structuralpattern.proxypattern.proxy.CglibProxy;
import structuralpattern.proxypattern.proxy.ProxyFactory;
import structuralpattern.proxypattern.proxy.ProxySubject;

/**
 * @author HUAWEI
 */
public class ProxyPatternTest {
    public static void main(String[] args) {
        //静态代理
        ISubject subject = new RealSubject();
        ProxySubject proxy = new ProxySubject(subject);
        proxy.doOperation();
        //JDK动态代理
        ProxyFactory factory = new ProxyFactory(new RealSubject());
        ISubject subject1 = factory.getProxyObject();
        subject1.doOperation();
        //CGLIB
        CglibProxy cglibProxy = new CglibProxy(new RealSubject2());
        RealSubject2 proxy2 = cglibProxy.getProxyObject();
        proxy2.doOperation();
    }
}
