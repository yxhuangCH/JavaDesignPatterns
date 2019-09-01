package com.yxhuang.pattern.abstract_factory;

public class WindowCheckBox implements CheckBox {
    @Override
    public void paint() {
        System.out.println("You have created WindowsCheckBox");
    }
}
