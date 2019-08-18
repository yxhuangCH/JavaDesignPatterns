package com.yxhuang.pattern.strategy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * 创建策略，实现支付方式
 *  这里用微信支付
 */
public class PayByWeiChat implements PayStrategy {

    private static final Map<String, String> DATA_BASE = new HashMap<>();
    private final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    private String password;
    private String account;
    private boolean singedIn;

    static {
        DATA_BASE.put("password123", "yxhuang@github.com");
    }

    @Override
    public boolean pay(int paymentAmount) {
        if (singedIn){
            System.out.println("Paying " + paymentAmount + " using WeiChatPay" );
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void collectPaymentDetails() {
        try {
            while (!singedIn){
                System.out.print("Enter the user's account: ");
                account = READER.readLine();
                System.out.print("Enter the password: ");
                password = READER.readLine();
                if (verify()){
                    System.out.println("Data verification has been successful.");
                } else {
                    System.out.println("Wrong email or ");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private boolean verify(){
        setSingedIn(account.equals(DATA_BASE.get(password)));
        return singedIn;
    }

    public void setSingedIn(boolean singedIn) {
        this.singedIn = singedIn;
    }
}
