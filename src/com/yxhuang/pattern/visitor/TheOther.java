package com.yxhuang.pattern.visitor;

public class TheOther implements Element {

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }

    public String theOther(){
        return "TheOther";
    }
}
