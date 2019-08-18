package com.yxhuang.pattern.visitor;

public class That implements Element {
    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }

    public String that(){
        return "That";
    }
}
