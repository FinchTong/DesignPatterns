package com.tong.BuilderPattern;

/**
 * @author finch
 * @date 2018/2/7
 */
public class BenzModel extends CarModel {
    @Override
    protected void start() {
        System.out.println("���۳����������������...");
    }

    @Override
    protected void stop() {
        System.out.println("���۳�Ӧ������ͣ��...");
    }

    @Override
    protected void alarm() {
        System.out.println("���۳���������...");
    }

    @Override
    protected void engineBoom() {
        System.out.println("���۳����淢����...");
    }
}
