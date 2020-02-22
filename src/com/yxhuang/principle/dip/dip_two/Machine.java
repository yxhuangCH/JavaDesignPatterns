package com.yxhuang.principle.dip.dip_two;

// 电机
public class Machine implements ButtonServer {

    @Override
    public void turnOn(){
        System.out.println("启动电机");

    }

    @Override
    public void turnOff(){
        System.out.println("停止电机");
    }


}
