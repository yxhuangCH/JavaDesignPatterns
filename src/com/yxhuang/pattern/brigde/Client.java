package com.yxhuang.pattern.brigde;

public class Client {

    public static void main(String[] args){
        testDevice(new Tv());
        testDevice(new Radio());
    }


    public static void testDevice(Device device){
        System.out.println("Test with basic remote.");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        device.printStatus();


        System.out.println("Test with Advanced remote.");
        AdvanceRemote advanceRemote = new AdvanceRemote(device);
        advanceRemote.power();
        advanceRemote.mute();
        device.printStatus();
    }
}
