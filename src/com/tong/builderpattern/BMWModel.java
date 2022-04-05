package com.tong.builderpattern;

/**
 * @author finch
 * @date 2018/2/7
 */
public class BMWModel extends CarModel {
    @Override
    protected void start() {
        System.out.println("宝马车发动喽...");
    }

    @Override
    protected void stop() {
        System.out.println("宝马车停车啦...");
    }

    @Override
    protected void alarm() {
        System.out.println("宝马车的喇叭声音是这样的...");
    }

    @Override
    protected void engineBoom() {
        System.out.println("宝马车的引擎是这个声音...");
    }
}
