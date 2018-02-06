package com.tong.factorymethod.four;

/**
 * ³éÏó¹¤³§
 *
 * @author finch
 * @date 2018/2/6
 */
public class AbstactFactoryMethod {

    public static void main(String[] args) {
        AbstractFoodFactory lzlm = new LzlmFoodFactory();
        Drinks water = lzlm.createDrinks();
        Noodles lzNoodles = new LzNoodles();
        water.prices();
        lzNoodles.desc();

        AbstractFoodFactory jgm = new JgmFoodFactory();
        Drinks tea = jgm.createDrinks();
        Noodles paoNoodles = new PaoNoodLes();
        tea.prices();
        paoNoodles.desc();
    }

}
