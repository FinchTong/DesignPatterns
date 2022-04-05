package com.tong.factorymethod.four;

/**
 * @author finch
 * @date 2018/2/6
 */
public class WaterDrinks implements Drinks {
    @Override
    public void prices() {
        System.out.println("水不要钱");
    }
}
