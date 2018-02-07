package com.tong.builderpattern;

import java.util.ArrayList;

/**
 * @author finch
 * @date 2018/2/7
 */
public class BMWBuilder extends CarBulider {

    private BMWModel bmwModel = new BMWModel();

    @Override
    public void setSequence(ArrayList sequence) {
        this.bmwModel.setSequence(sequence);
    }

    @Override
    public CarModel getCarModel() {
        return this.bmwModel;
    }
}
