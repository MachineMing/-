package structuralpattern.proxypattern.proxy;

import structuralpattern.proxypattern.ISubject;
import structuralpattern.proxypattern.impl.RealSubject;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 代理工厂 创建代理对象
 * @author HUAWEI
 */
public class ProxyFactory {
    private RealSubject subject;

    public ProxyFactory(RealSubject subject) {
        this.subject = subject;
    }

    public ISubject getProxyObject(){
        //使用Proxy获取代理对象
		/*
			newProxyInstance()方法参数说明：
			ClassLoader loader ： 类加载器，用于加载代理类，使用真实对象的类加载器即可
			Class<?>[] interfaces ： 真实对象所实现的接口，代理模式真实对象和代理对象实现相同的接口
			InvocationHandler h ： 代理对象的调用处理程序
		*/
        ISubject proxyInstance = (ISubject)
                Proxy.newProxyInstance(subject.getClass().getClassLoader(),
                        subject.getClass().getInterfaces(),
                        new InvocationHandler() {
                            /*
                                InvocationHandler中invoke方法参数说明：
                                proxy ： 代理对象
                                method ： 对应于在代理对象上调用的接口方法的 Method 实
                                例
                                args ： 代理对象调用接口方法时传递的实际参数
                            */
                            @Override
                            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                                System.out.println("JDK动态代理");
                                Object result = method.invoke(subject,args);
                                return result;
                            }
                        });
        return subject;
    }
}
