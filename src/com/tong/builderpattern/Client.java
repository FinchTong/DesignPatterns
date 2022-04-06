package com.tong.builderpattern;

import java.util.ArrayList;

/**
 *
 * 建造者模式
 *
 * 定义：指将一个复杂对象的构造与它的表示分离，使同样的构建过程可以创建不同的表示
 *
 * 应用场景：
 * 相同的方法，不同的执行顺序，产生不同的结果。
 * 多个部件或零件，都可以装配到一个对象中，但是产生的结果又不相同。
 * 产品类非常复杂，或者产品类中不同的调用顺序产生不同的作用。
 * 初始化一个对象特别复杂，参数多，而且很多参数都具有默认值。
 *
 * 优点如下：
 * 封装性好，构建和表示分离。
 * 扩展性好，各个具体的建造者相互独立，有利于系统的解耦。
 * 客户端不必知道产品内部组成的细节，建造者可以对创建过程逐步细化，而不对其它模块产生任何影响，便于控制细节风险。
 *
 * 缺点如下：
 * 产品的组成部分必须相同，这限制了其使用范围。
 * 如果产品的内部变化复杂，如果产品内部发生变化，则建造者也要同步修改，后期维护成本较大。
 *
 * @author finch
 * @date 2018/2/7
 */
public class Client {

    public static void main(String[] args) {
        ArrayList<String> sequence = new ArrayList<>();
        sequence.add("engineBoom");
        sequence.add("start");
        sequence.add("alarm");
        sequence.add("stop");

        CarBulider benzBulider = new BenzBulider();
        benzBulider.setSequence(sequence);
        CarModel benzModel = benzBulider.getCarModel();
        benzModel.run();

        BMWDirector bmwDirector = new BMWDirector();
        CarModel bmwModel = bmwDirector.getABMWModel();
        bmwModel.run();

    }

}
