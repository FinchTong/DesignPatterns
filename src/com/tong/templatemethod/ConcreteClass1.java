package com.tong.templatemethod;

/**
 * 具体模板类
 *
 * @author finch
 * @date 2018/2/6
 */
public class ConcreteClass1 extends AbstractClass {

    /**
     * 实现基本方法
     */
    @Override
    protected void doSomething() {

        //业务逻辑处理

        System.out.println("ConcreteClass1 do something");
    }

    /**
     * 实现基本方法
     */
    @Override
    protected void doAnything() {

        //业务逻辑处理

        System.out.println("ConcreteClass1 do anything");

    }
}
