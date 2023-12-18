package structuralpattern.adapterdesignpattern;

/**
 * @author HUAWEI
 */
public interface TFCard {
    String readTF();

    void writeTF(String msg);
}
