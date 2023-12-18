package structuralpattern.adapterdesignpattern.impl;

import structuralpattern.adapterdesignpattern.TFCard;

public class TFCardImpl implements TFCard {
    @Override
    public String readTF() {
        String msg = "Hello World TF Card";
        return msg;
    }

    @Override
    public void writeTF(String msg) {
        System.out.println("TF Card write a msg: "+msg);
    }
}
