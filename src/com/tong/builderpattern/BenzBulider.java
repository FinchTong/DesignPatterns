package com.tong.builderpattern;

import java.util.ArrayList;

/**
 * @author finch
 * @date 2018/2/7
 */
public class BenzBulider extends CarBulider {

    private BenzModel benzModel = new BenzModel();

    @Override
    public void setSequence(ArrayList sequence) {
        this.benzModel.setSequence(sequence);
    }

    @Override
    public CarModel getCarModel() {
        return this.benzModel;
    }
}
