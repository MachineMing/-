package structuralpattern.proxypattern.proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;
import structuralpattern.proxypattern.impl.RealSubject;
import structuralpattern.proxypattern.impl.RealSubject2;

import java.lang.reflect.Method;

/**
 * @author HUAWEI
 */
public class CglibProxy implements MethodInterceptor {
    private RealSubject2 subject;

    public CglibProxy(RealSubject2 subject) {
        this.subject = subject;
    }
    public RealSubject2 getProxyObject(){
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(RealSubject2.class);
        enhancer.setCallback(this);
        RealSubject2 obj = (RealSubject2) enhancer.create();
        return obj;
    }
    /**
        intercept方法参数说明：
        o ： 代理对象
        method ： 真实对象中的方法的Method实例
        args ： 实际参数
        methodProxy ：代理对象中的方法的method实例
       */
    @Override
    public RealSubject2 intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("CGLIB 代理");
        RealSubject2 realSubject = (RealSubject2) methodProxy.invokeSuper(o,objects);
        return realSubject;
    }
}
