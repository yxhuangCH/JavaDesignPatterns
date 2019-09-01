package com.yxhuang.pattern.factory_method;

public class Client {

    private static Dialog dialog;

    public static void main(String[] args){
        configure();
        runBusinessLogic();
    }

    static void configure(){
        String osName = System.getProperty("os.name");
        System.out.println("osName = " + osName);
        if (System.getProperty("os.name").equals("Mac OS X")) {
            dialog = new WindowsDialog();
        } else {
            dialog = new HtmlDialog();
        }
    }

    static void runBusinessLogic(){
        dialog.readerWindow();
    }
}
