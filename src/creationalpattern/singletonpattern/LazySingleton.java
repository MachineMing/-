package singletonpattern;


/**
 * @author HUAWEI
 */
public class LazySingleton {
    private LazySingleton() {
    }

    private volatile static LazySingleton instance;
    /**
     * 双重检查锁，解决线程不安全问题
     */
    public static LazySingleton getInstance() {
        /*
         指令重排问题：
            正常对象创建顺序：
            1、分配对象内存空间
            2、初始化对象
            3、设置声明instance指向刚分配的内存地址，此时instance != null
         指令重排： 因为2和3没有依赖关系，所以可能发生指令重排序：
            1、分配对象内存空间
            3、设置声明instance指向刚分配的内存地址，此时instance != null
            2、初始化对象
          做instance == null 判断时，instance可能没有完成初始化
          对instance加上volatile关键字
          private volatile static LazySingleton instance;
         */

        if (instance == null) {
            synchronized(LazySingleton.class){
                if(instance == null){
                    instance = new LazySingleton();
                }
            }
        }
        return instance;
    }
}