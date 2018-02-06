package com.tong.templatemethod;

/**
 * 抽象模板类
 *
 * @author finch
 * @date 2018/2/6
 */
public abstract class AbstractClass {

    /**
     * 基本方法
     */
    protected abstract void doSomething();

    /**
     * 基本方法
     */
    protected abstract void doAnything();

    public void templateMethod() {
        /*
        调用基本方法，完成相关的逻辑
         */
        this.doAnything();
        this.doSomething();
    }

}
