package com.yxhuang.pattern.state;

public class ThatState extends BaseState {
    @Override
    public void doThis() {
        System.out.println("ThatState doThis...");
    }

    @Override
    public void doThat() {
        System.out.println("ThatState doThat...");
    }
}
