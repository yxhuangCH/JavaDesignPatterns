package com.yxhuang.pattern.visitor;

public interface Element {

    void accept(IVisitor visitor);
}
