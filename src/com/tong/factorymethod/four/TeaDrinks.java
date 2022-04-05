package com.tong.factorymethod.four;

/**
 * @author finch
 * @date 2018/2/6
 */
public class TeaDrinks implements Drinks {
    @Override
    public void prices() {
        System.out.println("绿茶四块");
    }
}
