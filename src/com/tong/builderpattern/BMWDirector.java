package com.tong.builderpattern;

import java.util.ArrayList;

/**
 * @author finch
 * @date 2018/2/7
 */
public class BMWDirector {

    private ArrayList<String> sequenct = new ArrayList<>();
    private BMWBuilder bmwBuilder = new BMWBuilder();

    public CarModel getABMWModel() {
        this.sequenct.clear();
        this.sequenct.add("start");
        this.sequenct.add("stop");
        this.bmwBuilder.setSequence(sequenct);
        return this.bmwBuilder.getCarModel();
    }

    public CarModel getBBMWModel() {
        this.sequenct.clear();
        this.sequenct.add("start");
        this.sequenct.add("alarm");
        this.sequenct.add("stop");
        this.bmwBuilder.setSequence(sequenct);
        return this.bmwBuilder.getCarModel();
    }



}
