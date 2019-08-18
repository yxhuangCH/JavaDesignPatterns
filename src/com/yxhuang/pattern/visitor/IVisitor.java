package com.yxhuang.pattern.visitor;

/**
 *  2. Create a "visitor" base class with a visit() method for every "element" type
 */
public interface IVisitor {

    void visit(This e);

    void visit(That e);

    void visit(TheOther e);
}
