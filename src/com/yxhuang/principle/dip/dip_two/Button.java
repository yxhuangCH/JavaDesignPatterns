package com.yxhuang.principle.dip.dip_two;

public class Button {

    private ButtonServer buttonServer;

    public Button(ButtonServer buttonServer) {
        this.buttonServer = buttonServer;
    }

    public void poll(boolean isOpen){
        if (isOpen){
            buttonServer.turnOn();
        } else {
            buttonServer.turnOff();
        }

    }


}
