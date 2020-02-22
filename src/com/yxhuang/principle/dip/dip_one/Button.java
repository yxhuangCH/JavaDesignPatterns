package com.yxhuang.principle.dip.dip_one;

/**
 * 按钮类
 */
public class Button {

    private Lamp lamp;

    public Button() {
        lamp = new Lamp();
    }

    // 开关
    public void poll(boolean isOpen){
        if (isOpen){
            lamp.turnOn();
        } else {
            lamp.turnOff();
        }
    }
}
