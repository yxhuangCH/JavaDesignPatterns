package com.yxhuang.pattern.visitor;

public class This implements Element {

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }

    public String thiss(){
        return "This";
    }
}
