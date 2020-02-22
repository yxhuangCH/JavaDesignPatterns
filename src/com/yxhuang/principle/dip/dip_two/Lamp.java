package com.yxhuang.principle.dip.dip_two;

//灯泡
public class Lamp implements ButtonServer{

    @Override
    public void turnOn(){
        System.out.println("灯泡开");
    }

    @Override
    public void turnOff(){
        System.out.println("灯泡关");

    }
}
