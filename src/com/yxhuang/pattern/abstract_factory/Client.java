package com.yxhuang.pattern.abstract_factory;

/**
 *
 */
public class Client {

    public static void main(String[] args){
        Application app = configureApplication();
        app.paint();
    }

    // 在运行时 Application 根据特定的条件选择相应的工厂（晚绑定）
    private static Application configureApplication(){
        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac")){
            factory = new MacOsFactory();
        } else {
            factory = new WindowsFactory();
        }
        return new Application(factory);
    }
}
