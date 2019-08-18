package com.yxhuang.pattern.visitor;

public class DownVisitor implements IVisitor {
    @Override
    public void visit(This e) {
        System.out.println("do Down on " + e.thiss());
    }

    @Override
    public void visit(That e) {
        System.out.println("do Down on " + e.that());

    }

    @Override
    public void visit(TheOther e) {
        System.out.println("do Down on " + e.theOther());
    }
}
