package com.tong.adapter.v2;

/**
 * class adapter
 * 类的适配器模式
 */
public class AdapterTest2 {
    public static void main(String[] args) {
        Target target = new Adapter();
        target.output5v();
    }

}

class Adaptee {
    public int output220v() {
        return 220;
    }
}
interface Target{
    int output5v();
}
class Adapter extends Adaptee implements Target {

    @Override
    public int output5v() {
        int i = output220v();
        //......
        System.out.println("转换电压为5v");
        return 5;
    }
}
