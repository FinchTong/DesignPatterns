package com.tong.factorymethod.three;

import com.tong.factorymethod.Human;
import com.tong.factorymethod.YellowHuman;

/**
 * @author finch
 * @date 2018/2/6
 */
public class YellowHumanFactory extends AbstractHumanFactory {
    @Override
    public Human createHuman() {
        return new YellowHuman();
    }
}
