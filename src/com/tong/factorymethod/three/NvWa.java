package com.tong.factorymethod.three;

import com.tong.factorymethod.Human;

/**
 * 普通工厂模式特点：不仅仅做出来的产品要抽象， 工厂也应该需要抽象。
 * 工厂方法的好处就是更拥抱变化。当需求变化，只需要增删相应的类，不需要修改已有的类。
 * 缺点：每次新增一个具体产品类，也要同时新增一个具体工厂类
 *
 * @author finch
 * @date 2018/2/6
 */
public class NvWa {
    public static void main(String[] args) {
        AbstractHumanFactory blackHumanFactory = new BlackHumanFactory();
        Human blackHuman = blackHumanFactory.createHuman();
        blackHuman.getColor();
        blackHuman.talk();

        AbstractHumanFactory whiteHumanFactory = new WhiteHumanFactory();
        Human whiteHuman = whiteHumanFactory.createHuman();
        whiteHuman.getColor();
        whiteHuman.talk();

        AbstractHumanFactory yellowHumanFactory = new YellowHumanFactory();
        Human yellowHuman = yellowHumanFactory.createHuman();
        yellowHuman.getColor();
        yellowHuman.talk();
    }
}
