package com.tong.proxypattern.two;

/**
 * ��ͨ����������ֵ֪���������֪�����ǵĽ�ɫ��˭����������ʵ��ɫ�ı���Ը߲�ģ���Ӱ�졣
 *
 * @author finch
 * @date 2018/2/8
 */
public class Client {

    public static void main(String[] args) {
        IGamePlayer gamePlayer = new GamePlayerProxy("����");
        gamePlayer.login("zhangsan", "123456");
        gamePlayer.killBoss();
        gamePlayer.upgrade();
    }

}
