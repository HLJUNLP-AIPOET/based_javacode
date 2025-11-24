package com.sph.demo;

public class test {
    public static void main(String[] args) {
        PingpangPlayer pingpang = new PingpangPlayer("张三", 25);
        pingpang.study();
        pingpang.speak();
        BasketballCoach basketball = new BasketballCoach("李四", 30);
        basketball.teach();
    }
}
