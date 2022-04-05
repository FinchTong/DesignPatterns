package com.tong.proxypattern.two;

/**
 * 普通代理，调用者值知代理而不用知道真是的角色是谁，屏蔽了真实角色的变更对高层模块的影响。
 *
 * @author finch
 * @date 2018/2/8
 */
public class Client {

    public static void main(String[] args) {
        IGamePlayer gamePlayer = new GamePlayerProxy("张三");
        gamePlayer.login("zhangsan", "123456");
        gamePlayer.killBoss();
        gamePlayer.upgrade();
    }

}
