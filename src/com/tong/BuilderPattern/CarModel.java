package com.tong.BuilderPattern;

import java.util.ArrayList;

/**
 * @author finch
 * @date 2018/2/7
 */
public abstract class CarModel {

    private ArrayList<String> sequence = new ArrayList<>();

    protected abstract void start();

    protected abstract void stop();

    protected abstract void alarm();

    protected abstract void engineBoom();

    public void run() {
        for (String actionName : sequence) {
            if (actionName.equals("start")) {
                this.start();
            } else if (actionName.equals("stop")) {
                this.stop();
            } else if (actionName.equals("alarm")) {
                this.alarm();
            } else if (actionName.equals("engineBoom")) {
                this.engineBoom();
            }

        }
    }

    public void setSequence(ArrayList sequence) {
        this.sequence = sequence;
    }

}
