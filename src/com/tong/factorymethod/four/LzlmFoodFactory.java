package com.tong.factorymethod.four;

/**
 * @author finch
 * @date 2018/2/6
 */
public class LzlmFoodFactory extends AbstractFoodFactory {
    @Override
    public Noodles createNoodles() {
        return new LzNoodles();
    }

    @Override
    public Drinks createDrinks() {
        return new WaterDrinks();
    }
}
