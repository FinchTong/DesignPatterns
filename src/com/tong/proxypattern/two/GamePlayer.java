package com.tong.proxypattern.two;

/**
 * @author finch
 * @date 2018/2/8
 */
public class GamePlayer implements IGamePlayer {

    public String name = "";

    public GamePlayer(IGamePlayer gamePlayer, String name) {
        if (gamePlayer == null) {
            throw new NullPointerException("不能创建角色");
        } else {
            this.name = name;
        }
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
