package com.yxhuang.pattern.strategy;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;
import com.yxhuang.pattern.builder.Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Client {

    private static Map<Integer, Integer> priceOnProducts = new HashMap<>();
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static Order order = new Order();
    private static PayStrategy strategy;

    static {
        priceOnProducts.put(1, 2000);
        priceOnProducts.put(2, 1800);
        priceOnProducts.put(3, 500);
    }

    public static void main(String[] args) throws IOException{
        while (!order.isClosed()){
            int cost;

            String continueChoice;
            do {
                System.out.print("Please, select a product: \n"
                            + "1 - 手机 \n"
                            + "2 - 耳机 \n"
                            + "3 - 手机膜\n");
                int choice = Integer.parseInt(reader.readLine());
                cost = priceOnProducts.get(choice);
                System.out.print("Count: ");
                int count = Integer.parseInt(reader.readLine());
                order.setTotalCost(cost * count);
                System.out.print("Do you wish to continue selecting products? Y/N: ");
                continueChoice = reader.readLine();
            } while (continueChoice.equalsIgnoreCase("Y"));


            if (strategy == null){
                System.out.println("Please select a payment method: \n" +
                            "1 - WeiChatPay \n" +
                            "2 - Credit Card");
                String paymentMethod = reader.readLine();

                if (paymentMethod.equals("1")){
                    strategy = new PayByWeiChat();
                } else {
                    strategy = new PayByCreditCard();
                }

                order.processOrder(strategy);

                System.out.print("Pay " + order.getTotalCost() + " units or Continue shopping? P/C: ");
                String proceed = reader.readLine();
                if (proceed.equalsIgnoreCase("P")){
                    if (strategy.pay(order.getTotalCost())){
                        System.out.println("Payment has been successful.");
                    } else {
                        System.out.println("Fail! Please, check your data.");
                    }
                    order.setClosed(true);
                }
            }
        }

    }
}
