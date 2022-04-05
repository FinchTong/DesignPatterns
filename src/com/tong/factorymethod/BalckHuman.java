package com.tong.factorymethod;

/**
 * @author finch
 * @date 2018/2/6
 */
public class BalckHuman implements Human {

    @Override
    public void getColor() {
        System.out.println("肤色为黑");
    }

    @Override
    public void talk() {
        System.out.println("黑人说话");
    }
}
