package com.yxhuang.pattern.decorator;

/**
 *  BaseDecorator
 */
public class DataSourceDecorator implements DataSource {

    private DataSource wrappee; //  Component 对象的引用


    public DataSourceDecorator(DataSource wrappee) {
        this.wrappee = wrappee;
    }

    @Override
    public void writeData(String data) {
        wrappee.writeData(data);
    }

    @Override
    public String readData() {
        return wrappee.readData();
    }
}
