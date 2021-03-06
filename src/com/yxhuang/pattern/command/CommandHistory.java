package com.yxhuang.pattern.command;

import java.util.Stack;

/**
 *  Invoker
 */
public class CommandHistory {

    private Stack<Command> history = new Stack<>();

    public void push(Command command){
        history.push(command);
    }

    public Command pop(){
        return history.pop();
    }

    public boolean isEmpty(){
        return history.isEmpty();
    }
}

