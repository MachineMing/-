package structuralpattern.adapterdesignpattern;
/**
 * 对象适配器
 * 实现目标接口
 * 导入适配对象
 * @author HUAWEI
 */
public class SDAdapterTFPlus implements SDCard {
    private TFCard tfCard;
    @Override
    public String readSD() {
        return tfCard.readTF();
    }

    @Override
    public void writeSD(String msg) {
        tfCard.writeTF(msg);
    }
}
