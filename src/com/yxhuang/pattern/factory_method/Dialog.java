package com.yxhuang.pattern.factory_method;

/**
 *  Base creator
 */
public abstract class Dialog {

    public void readerWindow(){
        Button okButton = createButton();
        okButton.render();
    }


    /**
     *  SubClass will override this method in order to create
     *  specific button objects.
     *   延迟到子类创建
     * @return
     */
    public abstract Button createButton();
}
