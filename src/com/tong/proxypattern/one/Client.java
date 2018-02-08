package com.tong.proxypattern.one;

/**
 * @author finch
 * @date 2018/2/7
 */
public class Client {

    public static void main(String[] args) {
        IGamePlayer gamePlayer = new GamePlayer("уехЩ");
        IGamePlayer gamePlayerProxy = new GamePlayerProxy(gamePlayer);

        gamePlayerProxy.login("zhangsan", "123456");
        gamePlayerProxy.killBoss();
        gamePlayerProxy.upgrade();
    }

}
