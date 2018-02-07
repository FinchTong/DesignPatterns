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
        System.out.println("������Ϊ" + user + "���û�" + this.name + "����ɹ���");
    }

    @Override
    public void killBoss() {
        System.out.println(this.name + "���ڴ��");
    }

    @Override
    public void upgrade() {
        System.out.println(this.name + " ����һ����");
    }
}
