package com.tong.factorymethod.four;

/**
 * @author finch
 * @date 2018/2/6
 */
public class JgmFoodFactory extends AbstractFoodFactory {
    @Override
    public Noodles createNoodles() {
        return new PaoNoodLes();
    }

    @Override
    public Drinks createDrinks() {
        return new TeaDrinks();
    }
}
