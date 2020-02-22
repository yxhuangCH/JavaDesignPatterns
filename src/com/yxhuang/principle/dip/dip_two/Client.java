package com.yxhuang.principle.dip.dip_two;

import com.yxhuang.principle.dip.dip_two.Button;
import com.yxhuang.principle.dip.dip_one.MachineButton;

public class Client {

    public static void main(String[] args) {


        ButtonServer lamp = new Lamp();
        Button button = new Button(lamp);

        // 开灯
        button.poll(true);

        try {
            Thread.sleep(2 * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // 关灯
        button.poll(false);


        ButtonServer machine = new Machine();
        Button machineButton = new Button(machine);

        // 开机
        machineButton.poll(true);

        try {
            Thread.sleep(2 * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // 停机
        machineButton.poll(false);

    }
}
