package com.yxhuang.principle.dip.dip_one;

import java.io.IOException;

public class Client {

    public static void main(String[] args) {


        // 灯泡开关
        Button button = new Button();

        // 开灯
        button.poll(true);

        try {
            Thread.sleep(2 * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // 关灯
        button.poll(false);


        MachineButton machineButton = new MachineButton();

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
