package com.yxhuang.pattern.abstract_factory;

/**
 * 工厂用户不用知道使用哪个具体的工程，它们只有与抽象工厂和抽象产品接口打交道
 */
public class Application {

    private Button button;
    private CheckBox checkBox;

    public Application(GUIFactory factory){
        button = factory.createButton();
        checkBox = factory.createCheckBox();
    }

    public void paint(){
        button.paint();
        checkBox.paint();
    }
}
