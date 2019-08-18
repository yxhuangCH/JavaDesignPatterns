package com.yxhuang.pattern.visitor;

/**
 * 访问者模式
 */
public class VisitorDemo {

    static Element[] list = {new This(), new That(), new TheOther()};

    // 4. Client creates "visitor" objects and passes each to accept() calls
    public static void main(String[] args){
        UpIVisitor upVisitor = new UpIVisitor();
        DownVisitor downVisitor = new DownVisitor();
        for (int i = 0; i < list.length; i++){
            list[i].accept(upVisitor);
        }
        for (int i = 0; i < list.length; i++){
            list[i].accept(downVisitor);
        }
    }
}
