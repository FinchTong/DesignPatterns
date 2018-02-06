package com.tong.factorymethod.three;

import com.tong.factorymethod.BalckHuman;
import com.tong.factorymethod.Human;

/**
 * @author finch
 * @date 2018/2/6
 */
public class BlackHumanFactory extends AbstractHumanFactory {
    @Override
    public Human createHuman() {
        return new BalckHuman();
    }
}
