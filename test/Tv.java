package test;

public class Tv {
    public int channel;
    public String color;

    public void print() {
        System.out.println("Tv의 현재 채널은 : " + channel + "이고, Tv의 색깔은 " + color + " 입니다.");
    }

    public void channelUp() {
        channel++;
    }

    public void channelDown() {
        channel--;
    }
}
