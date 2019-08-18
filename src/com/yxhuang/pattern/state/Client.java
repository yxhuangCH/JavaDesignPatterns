package com.yxhuang.pattern.state;

public class Client {

    public static void main(String[] args){
        // 定义上下文
        Context context = new Context();
        // 设置初始状态
        context.changeState(Context.THIS_STATE);
        context.doThis();

        // 切换状态
        context.changeState(Context.THAT_STATE);
        context.doThat();
    }
}

