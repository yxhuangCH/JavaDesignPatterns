package com.yxhuang.pattern.factory_method;

/**
 *  Concrete creator
 */
public class HtmlDialog extends Dialog{
    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
