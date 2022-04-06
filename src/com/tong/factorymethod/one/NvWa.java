package com.tong.factorymethod.one;

import com.tong.factorymethod.BalckHuman;
import com.tong.factorymethod.Human;
import com.tong.factorymethod.WhiteHuman;
import com.tong.factorymethod.YellowHuman;

/**
 *
 * 简单工厂方法模式
 *
 * 定义：
 *  定义一个创建产品对象的工厂接口，将产品对象的实际创建工作推迟到具体子工厂类当中
 *
 * 应用场景：
 *  对于产品种类相对较少的情况，考虑使用简单工厂模式。使用简单工厂模式的客户端只需要传入工厂类的参数，不需要关心如何创建对象的逻辑，可以很方便地创建所需产品。
 *
 * 优点：
 *  1.工厂类包含必要的逻辑判断，可以决定在什么时候创建哪一个产品的实例。客户端可以免除直接创建产品对象的职责，很方便的创建出相应的产品。工厂和产品的职责区分明确。
 *  2.客户端无需知道所创建具体产品的类名，只需知道参数即可。
 *  3.也可以引入配置文件，在不修改客户端代码的情况下更换和添加新的具体产品类。
 *
 *
 * @author finch
 * @date 2018/2/6
 */
public class NvWa {

    public static void main(String[] args) {

        AbstractHumanFactory humanFactory = new HumanFactory();

        Human blackHuman = humanFactory.createHuman(BalckHuman.class);

        blackHuman.getColor();
        blackHuman.talk();

        Human whiteHuman = humanFactory.createHuman(WhiteHuman.class);

        whiteHuman.getColor();
        whiteHuman.talk();

        Human yellowHuman = humanFactory.createHuman(YellowHuman.class);

        yellowHuman.getColor();
        yellowHuman.talk();

    }

}
