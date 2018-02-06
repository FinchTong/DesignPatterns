package com.tong.factorymethod.three;

import com.tong.factorymethod.Human;
import com.tong.factorymethod.WhiteHuman;

/**
 * @author finch
 * @date 2018/2/6
 */
public class WhiteHumanFactory extends AbstractHumanFactory {
    @Override
    public Human createHuman() {
        return new WhiteHuman();
    }
}
