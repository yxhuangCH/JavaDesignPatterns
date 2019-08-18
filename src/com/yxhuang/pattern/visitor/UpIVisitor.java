package com.yxhuang.pattern.visitor;

/**
 *  3. Create v "visitor" derived class for each "operation" perform on "elements"
 */
public class UpIVisitor implements IVisitor {
    @Override
    public void visit(This e) {
        System.out.println("do Up on" +  e.thiss());
    }

    @Override
    public void visit(That e) {
        System.out.println("do Up on" +  e.that());

    }

    @Override
    public void visit(TheOther e) {
        System.out.println("do Up on" +  e.theOther());

    }
}
