package com.yxhuang.pattern.state;

/**
 * 上下文
 */
public class Context {

    // 定义状态
    public final static BaseState THIS_STATE = new ThisState();
    public final static BaseState THAT_STATE = new ThatState();

    // 当前状态
    private BaseState state;

    public void changeState(BaseState state){
        this.state = state;
        this.state.setContext(this);

    }

    public void doThis(){
        this.state.doThis();
    }

    public void doThat(){
        this.state.doThat();
    }
}
