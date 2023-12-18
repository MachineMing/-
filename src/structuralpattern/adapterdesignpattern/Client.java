package structuralpattern.adapterdesignpattern;

import structuralpattern.adapterdesignpattern.impl.Computer;
import structuralpattern.adapterdesignpattern.impl.SDCardImpl;

/**
 * @author HUAWEI
 */
public class Client {
    public static void main(String[] args) {
        Computer computer = new Computer();
        SDCard sdCard = new SDCardImpl();
        System.out.println(computer.readSD(sdCard));
        System.out.println("-------------");
        SDAdapterTF adapter = new SDAdapterTF();
        System.out.println(computer.readSD(adapter));
    }
}
