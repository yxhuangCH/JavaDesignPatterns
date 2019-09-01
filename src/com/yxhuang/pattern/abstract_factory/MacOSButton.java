package com.yxhuang.pattern.abstract_factory;

/**
 * 所有的一系列产品都有着相同的变体（MacOs / Windows）
 *  mac 的 button
 */
public class MacOSButton implements Button {
    @Override
    public void paint() {
        System.out.println("You have created MacOSButton");
    }
}
