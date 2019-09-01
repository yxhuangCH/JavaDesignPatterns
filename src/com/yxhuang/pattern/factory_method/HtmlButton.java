package com.yxhuang.pattern.factory_method;

public class HtmlButton implements Button {
    @Override
    public void render() {
        System.out.println("<button>Text Button</button");
        onClick();
    }

    @Override
    public void onClick() {
        System.out.println("Click! Button says - 'Hell World!'");

    }
}
