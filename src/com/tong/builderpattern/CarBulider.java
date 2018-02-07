package com.tong.builderpattern;

import java.util.ArrayList;

/**
 * @author finch
 * @date 2018/2/7
 */
public abstract class CarBulider {

    public abstract void setSequence(ArrayList sequence);

    public abstract CarModel getCarModel();
}
