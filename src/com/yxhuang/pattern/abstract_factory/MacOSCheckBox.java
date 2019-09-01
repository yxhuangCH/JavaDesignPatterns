package com.yxhuang.pattern.abstract_factory;

public class MacOSCheckBox implements CheckBox {
    @Override
    public void paint() {
        System.out.println("You have created MacOSCheckBox");
    }
}
