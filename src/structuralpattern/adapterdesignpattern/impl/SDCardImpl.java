package structuralpattern.adapterdesignpattern.impl;

import structuralpattern.adapterdesignpattern.SDCard;

/**
 * @author HUAWEI
 */
public class SDCardImpl implements SDCard {
    @Override
    public String readSD() {
        String msg = "Hello World SD";
        return msg;
    }

    @Override
    public void writeSD(String msg) {
        System.out.println("SD Card write msg: " + msg);
    }
}
