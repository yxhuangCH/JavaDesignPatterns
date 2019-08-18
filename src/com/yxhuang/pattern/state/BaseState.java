package com.yxhuang.pattern.state;

public abstract class BaseState {

    protected Context context;

    public void setContext(Context context) {
        this.context = context;
    }

    public abstract void doThis();

    public abstract void doThat();
}
