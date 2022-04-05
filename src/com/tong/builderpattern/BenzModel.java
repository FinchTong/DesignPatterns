package com.tong.builderpattern;

/**
 * @author finch
 * @date 2018/2/7
 */
public class BenzModel extends CarModel {
    @Override
    protected void start() {
        System.out.println("奔驰车跑起来是这个样子...");
    }

    @Override
    protected void stop() {
        System.out.println("奔驰车应该这样停车...");
    }

    @Override
    protected void alarm() {
        System.out.println("奔驰车按喇叭啦...");
    }

    @Override
    protected void engineBoom() {
        System.out.println("奔驰车引擎发动了...");
    }
}
