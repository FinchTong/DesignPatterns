package com.tong.factorymethod;

/**
 * @author finch
 * @date 2018/2/6
 */
public class WhiteHuman implements Human {

    @Override
    public void getColor() {
        System.out.println("肤色为白");
    }

    @Override
    public void talk() {
        System.out.println("白人说话");
    }
}
