package com.tong.factorymethod.one;

import com.tong.factorymethod.BalckHuman;
import com.tong.factorymethod.Human;
import com.tong.factorymethod.WhiteHuman;
import com.tong.factorymethod.YellowHuman;

/**
 * @author finch
 * @date 2018/2/6
 */
public class NvWa {

    public static void main(String[] args) {

        AbstractHumanFactory humanFactory = new HumanFactory();

        Human blackHuman = humanFactory.createHuman(BalckHuman.class);

        blackHuman.getColor();
        blackHuman.talk();

        Human whiteHuman = humanFactory.createHuman(WhiteHuman.class);

        whiteHuman.getColor();
        whiteHuman.talk();

        Human yellowHuman = humanFactory.createHuman(YellowHuman.class);

        yellowHuman.getColor();
        yellowHuman.talk();

    }

}
