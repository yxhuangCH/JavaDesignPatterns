package com.yxhuang.pattern.abstract_factory;


/**
 * 每个具体的工厂类继承抽象工厂类，并且负责创建单一系列的产品
 */
public class MacOsFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new MacOSCheckBox();
    }
}
