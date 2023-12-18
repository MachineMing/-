package structuralpattern.adapterdesignpattern;


/**
 * 创建实例对象
 * 实现接口，但不实现方法
 * 后续用一个类继承该类，只重写需要的方法
 * @author HUAWEI
 */
public class AdapterPlusPlus implements SDCard{
    @Override
    public String readSD() {
        return null;
    }

    @Override
    public void writeSD(String msg) {

    }
}
