package com.tong.templatemethod;

/**
 * ����ģ����
 *
 * @author finch
 * @date 2018/2/6
 */
public class ConcreteClass1 extends AbstractClass {

    /**
     * ʵ�ֻ�������
     */
    @Override
    protected void doSomething() {

        //ҵ���߼�����

        System.out.println("ConcreteClass1 do something");
    }

    /**
     * ʵ�ֻ�������
     */
    @Override
    protected void doAnything() {

        //ҵ���߼�����

        System.out.println("ConcreteClass1 do anything");

    }
}
