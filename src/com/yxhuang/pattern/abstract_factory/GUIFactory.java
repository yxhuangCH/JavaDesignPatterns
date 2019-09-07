package com.yxhuang.pattern.abstract_factory;


/**
 * 抽象工厂类定义所有产品的抽象类型
 */
public interface GUIFactory {

    Button createButton();

    CheckBox createCheckBox();
}
