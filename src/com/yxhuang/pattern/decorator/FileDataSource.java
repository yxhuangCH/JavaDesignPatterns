package com.yxhuang.pattern.decorator;

import java.io.*;

/**
 *  具体的 Component
 */
public class FileDataSource implements DataSource {

    private String name;

    public FileDataSource(String name) {
        this.name = name;
    }

    @Override
    public void writeData(String data) {
        File file = new File(this.name);
        try (OutputStream fos = new FileOutputStream(file)){
            fos.write(data.getBytes(), 0, data.length());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public String readData() {
        char[] buffer = null;
        File file = new File(name);

        try (FileReader reader = new FileReader(file)){
            buffer = new char[(int)file.length()];
            reader.read(buffer);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new String(buffer);
    }
}
