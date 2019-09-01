package com.yxhuang.pattern.abstract_factory;


/**
 * 抽象工厂类知道所有产品的抽象类型
 */
public interface GUIFactory {

    Button createButton();

    CheckBox createCheckBox();
}
