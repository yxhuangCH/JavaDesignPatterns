package com.yxhuang.principle.dip.dip_one;

public class MachineButton {

    private Machine machine;

    public MachineButton() {
        machine = new Machine();
    }

    // 开关
    public void poll(boolean isOpen){
        if (isOpen){
            machine.turnOn();
        } else {
            machine.turnOff();
        }
    }
}
