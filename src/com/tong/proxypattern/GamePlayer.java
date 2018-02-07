package com.tong.proxypattern;

/**
 * @author finch
 * @date 2018/2/7
 */
public class GamePlayer implements IGamePlayer {

    private String name = "";

    public GamePlayer(String name) {
        this.name = name;
    }

    @Override
    public void login(String user, String password) {
        System.out.println("登入名为" + user + "的用户" + this.name + "登入成功！");
    }

    @Override
    public void killBoss() {
        System.out.println(this.name + "正在打怪");
    }

    @Override
    public void upgrade() {
        System.out.println(this.name + " 又升一级！");
    }
}
