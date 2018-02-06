package com.tong.factorymethod.three;

import com.tong.factorymethod.Human;

/**
 * ��ͨ����ģʽ�ص㣺�������������Ĳ�ƷҪ���� ����ҲӦ����Ҫ����
 * ���������ĺô����Ǹ�ӵ���仯��������仯��ֻ��Ҫ��ɾ��Ӧ���࣬����Ҫ�޸����е��ࡣ
 * ȱ�㣺ÿ������һ�������Ʒ�࣬ҲҪͬʱ����һ�����幤����
 *
 * @author finch
 * @date 2018/2/6
 */
public class NvWa {
    public static void main(String[] args) {
        AbstractHumanFactory blackHumanFactory = new BlackHumanFactory();
        Human blackHuman = blackHumanFactory.createHuman();
        blackHuman.getColor();
        blackHuman.talk();

        AbstractHumanFactory whiteHumanFactory = new WhiteHumanFactory();
        Human whiteHuman = whiteHumanFactory.createHuman();
        whiteHuman.getColor();
        whiteHuman.talk();

        AbstractHumanFactory yellowHumanFactory = new YellowHumanFactory();
        Human yellowHuman = yellowHumanFactory.createHuman();
        yellowHuman.getColor();
        yellowHuman.talk();
    }
}
