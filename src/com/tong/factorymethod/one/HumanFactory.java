package com.tong.factorymethod.one;

import com.tong.factorymethod.Human;

/**
 * 简单工厂（反射）
 *
 * @author finch
 * @date 2018/2/6
 */
public class HumanFactory extends AbstractHumanFactory {

    @Override
    public <T extends Human> T createHuman(Class<T> c) {
        Human human = null;
        try {
            human = (T) Class.forName(c.getName()).newInstance();
        } catch (Exception e) {
            System.out.println("人种生产失败");
        }

        return (T) human;
    }
}
