package structuralpattern.adapterdesignpattern.impl;

import structuralpattern.adapterdesignpattern.SDCard;

/**
 * @author HUAWEI
 */
public class Computer {
    /**
     *  电脑只能读取SDCard
     *  需求：读取TFCard
     *  方法：创建适配器，读取TFCard
     */
    public String readSD(SDCard sdCard){
        if(sdCard == null){
            throw new NullPointerException("sd card null");
        }
        return sdCard.readSD();
    }
}
