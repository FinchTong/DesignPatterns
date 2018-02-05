package com.tong.singletonpattern;

/**
 * ��̬�ڲ���
 * ֻ���ڵ���getSingletonDemo5()����ʱ�Ż��ʼ����
 *
 * @author tong
 */
public class SingletonDemo5 {

    private static class SingletonHolder {
        private static final SingletonDemo5 singletonDemo = new SingletonDemo5();
    }

    private SingletonDemo5() {

    }

    public static SingletonDemo5 getSingletonDemo5() {
        return SingletonHolder.singletonDemo;
    }

}
