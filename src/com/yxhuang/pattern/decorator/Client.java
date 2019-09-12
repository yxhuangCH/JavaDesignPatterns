package com.yxhuang.pattern.decorator;

public class Client {

    public static void main(String[] args){
        String salaryRecords = "Name,Salary\nJohn Smith,100000\nSteven Jobs,912000";

        DataSource dataSource = new FileDataSource("out/OutPutDemo.txt");
        DataSourceDecorator encryDecorator = new EncrytionDecorator(dataSource);
        DataSourceDecorator encoded = new CompressionDecorator(encryDecorator);

        encoded.writeData(salaryRecords);

        System.out.println("- Input --------------------");
        System.out.println(salaryRecords);
        System.out.println("- Encoded --------------------");
        System.out.println(dataSource.readData());
        System.out.println("- Decoded --------------------");
        System.out.println(encoded.readData());
    }
}
