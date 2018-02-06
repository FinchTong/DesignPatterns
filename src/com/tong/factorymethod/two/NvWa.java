package com.tong.factorymethod.two;

import com.tong.factorymethod.Human;

/**
 * @author finch
 * @date 2018/2/6
 */
public class NvWa {

    public static void main(String[] args) {
        Human blackHuman = HumanFactory.createBlackHuman();
        blackHuman.getColor();
        blackHuman.talk();

        Human whiteHuman = HumanFactory.createWhiteHuman();
        whiteHuman.getColor();
        whiteHuman.talk();

        Human yellowHuman = HumanFactory.createYellowHuman();
        yellowHuman.getColor();
        yellowHuman.talk();

    }

}
