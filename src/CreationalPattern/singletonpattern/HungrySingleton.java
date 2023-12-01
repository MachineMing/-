package singletonpattern;

/**
 * 饿汉模式
 * @author HUAWEI
 */
public class HungrySingleton {
    /**
     * 静态实例代码段，饿汉实现类加载初始化时调用构造方法
    */
    private static final HungrySingleton HUNGRY_SINGLETON = new HungrySingleton();

    /**
     * 私有方法防止外部调用创建对象
     */

    private HungrySingleton() {

    }

    /**
     * 外部类获得单例对象方法
     * @return 单例对象
     */
    public static HungrySingleton getInstance() {
        return HUNGRY_SINGLETON;
    }
}
