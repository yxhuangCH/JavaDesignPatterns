package com.yxhuang.pattern.brigde;

public class BasicRemote implements Remote {
    protected Device device;

    public BasicRemote(Device device) {
        this.device = device;
    }

    /**
     *  Abstraction(BasicRemote) 将 Client 的请求转发给它的 Implementation(Device)
     */
    @Override
    public void power() {
        System.out.println("Remote: power toggle");
        if (device.isEnabled()){
            device.disable();
        } else {
            device.disable();
        }
    }

    @Override
    public void volumDown() {
        System.out.println("Remote: volume down");
        device.setVolume(device.getVolume() - 10);
    }

    @Override
    public void volumeUp() {
        System.out.println("Remote: volume up");
        device.setVolume(device.getVolume() + 10);

    }

    @Override
    public void channelDown() {
        System.out.println("Remote: channel down");
        device.setChannel(device.getChannel() -1);
    }

    @Override
    public void channelUp() {
        System.out.println("Remote: channel up");
        device.setChannel(device.getChannel() + 1);
    }
}
