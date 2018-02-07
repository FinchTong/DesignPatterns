package com.tong.builderpattern;

import java.util.ArrayList;

/**
 * @author finch
 * @date 2018/2/7
 */
public class Client {

    public static void main(String[] args) {
        ArrayList<String> sequence = new ArrayList<>();
        sequence.add("engineBoom");
        sequence.add("start");
        sequence.add("alarm");
        sequence.add("stop");

        CarBulider benzBulider = new BenzBulider();
        benzBulider.setSequence(sequence);
        CarModel benzModel = benzBulider.getCarModel();
        benzModel.run();

        BMWDirector bmwDirector = new BMWDirector();
        CarModel bmwModel = bmwDirector.getABMWModel();
        bmwModel.run();

    }

}
