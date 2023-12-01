package singletonpattern;

import java.io.Serializable;

/**
 * 饿汉模式
 * @author HUAWEI
 */
public class HungrySingleton implements Serializable {
    /**
     * 静态实例代码段，饿汉实现类加载初始化时调用构造方法
    */
    // private static final HungrySingleton HUNGRY_SINGLETON = new HungrySingleton();

    private static final HungrySingleton HUNGRY_SINGLETON;

    static{
        //静态变量、静态代码块中的变量、transient变量不会被序列化
        HUNGRY_SINGLETON = new HungrySingleton();
    }


    /**
     * 私有方法防止外部调用创建对象
     * 1、加入判断，防止反射破坏单例模式
     */
    private HungrySingleton() {
        if(HUNGRY_SINGLETON != null){
            throw new RuntimeException("The existence of multiple instances is not allowed in the singleton pattern.");
        }
    }

    /**
     * 外部类获得单例对象方法
     * @return 单例对象
     */
    public static HungrySingleton getInstance() {
        return HUNGRY_SINGLETON;
    }

    /**
     * 实现方法防止序列化
     * @return HUNGRY_SINGLETON
     */
    public Object readSolve(){
        return HUNGRY_SINGLETON;
    }
}
