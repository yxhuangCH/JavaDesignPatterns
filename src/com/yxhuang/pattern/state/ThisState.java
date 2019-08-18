package com.yxhuang.pattern.state;

public class ThisState extends BaseState {

    @Override
    public void doThis() {
        System.out.println("ThisState doThis...");

    }

    @Override
    public void doThat() {
        System.out.println("ThisState doThis...");
    }
}
