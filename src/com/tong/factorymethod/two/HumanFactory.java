package com.tong.factorymethod.two;

import com.tong.factorymethod.BalckHuman;
import com.tong.factorymethod.Human;
import com.tong.factorymethod.WhiteHuman;
import com.tong.factorymethod.YellowHuman;

/**
 * �෽����̬����ģʽ
 *
 * @author finch
 * @date 2018/2/6
 */
public class HumanFactory {

    public static Human createBlackHuman(){
        return new BalckHuman();
    }

    public static Human createWhiteHuman() {
        return new WhiteHuman();
    }

    public static Human createYellowHuman() {
        return new YellowHuman();
    }

}
