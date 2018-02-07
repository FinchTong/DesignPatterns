package com.tong.BuilderPattern;

/**
 * @author finch
 * @date 2018/2/7
 */
public class BMWModel extends CarModel {
    @Override
    protected void start() {
        System.out.println("���������...");
    }

    @Override
    protected void stop() {
        System.out.println("����ͣ����...");
    }

    @Override
    protected void alarm() {
        System.out.println("����������������������...");
    }

    @Override
    protected void engineBoom() {
        System.out.println("�������������������...");
    }
}
