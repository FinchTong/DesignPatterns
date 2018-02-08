package com.tong.proxypattern.two;

/**
 * @author finch
 * @date 2018/2/8
 */
public class GamePlayer implements IGamePlayer {

    public String name = "";

    public GamePlayer(IGamePlayer gamePlayer, String name) {
        if (gamePlayer == null) {
            throw new NullPointerException("���ܴ�����ɫ");
        } else {
            this.name = name;
        }
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
