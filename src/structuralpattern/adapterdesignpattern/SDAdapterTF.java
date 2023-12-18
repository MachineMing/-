package structuralpattern.adapterdesignpattern;
import structuralpattern.adapterdesignpattern.impl.TFCardImpl;

/**
 * 类适配器
 * 继承适配类
 * 实现目标接口
 */
public class SDAdapterTF extends TFCardImpl implements SDCard {
    @Override
    public String readSD() {
        System.out.println("adapter read tf card");
        return readTF();
    }

    @Override
    public void writeSD(String msg) {
        System.out.println("adapter writer tf card");
        writeTF(msg);
    }
}
