package com.tong.factorymethod.one;

import com.tong.factorymethod.Human;

/**
 * @author finch
 * @date 2018/2/6
 */
public abstract class AbstractHumanFactory {

    public abstract <T extends Human> T createHuman(Class<T> c);

}
