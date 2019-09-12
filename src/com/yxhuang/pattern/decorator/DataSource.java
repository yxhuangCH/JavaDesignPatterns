package com.yxhuang.pattern.decorator;

/**
 *  Component 接口
 */
public interface DataSource {

    void writeData(String data);

    String readData();
}
