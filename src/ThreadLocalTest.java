import java.util.Date;

/**
 * 测试类
 * @author HUAWEI
 */
public class ThreadLocalTest {
    public static void main(String[] args) {
        Thread t1 = new Thread("Thread-1"){
            @Override
            public void run() {
                ThreadLocal threadLocal = new ThreadLocal<Date>();
                ThreadLocal threadLocal1 = new ThreadLocal<Integer>();
                ThreadLocal name = new ThreadLocal<String>();
                Date date = new Date();
                date.setTime(System.currentTimeMillis());
                threadLocal.set(date);

                threadLocal1.set(1);

                name.set(this.getName());
                System.out.println(threadLocal.get());
                System.out.println(threadLocal1.get());
                System.out.println(name.get());
            }
        };

        t1.start();
//      t1.run();
    }
}
