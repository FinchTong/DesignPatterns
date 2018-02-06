package com.tong.factorymethod;

/**
 * @author finch
 * @date 2018/2/6
 */
public class YellowHuman implements Human {

    @Override
    public void getColor() {
        System.out.println("肤色为黄");
    }

    @Override
    public void talk() {
        System.out.println("黄人说话");
    }
}
