package com.tong.templatemethod;

/**
 * @author finch
 * @date 2018/2/6
 */
public class ConcreteClass2 extends AbstractClass {

    /**
     * ʵ�ֻ�������
     */
    @Override
    protected void doSomething() {

        //ҵ���߼�����

        System.out.println("ConcreteClass2 do something");
    }

    /**
     * ʵ�ֻ�������
     */
    @Override
    protected void doAnything() {

        //ҵ���߼�����

        System.out.println("ConcreteClass2 do anything");
    }
}
