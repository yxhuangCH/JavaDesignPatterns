package com.yxhuang.pattern.strategy;

/**
 * 支付方式的接口
 */
public interface PayStrategy {

    /**
     * 支付
     * @param paymentAmount 支付的价钱
     * @return
     */
    boolean pay(int paymentAmount);

    /**
     * 支付详情
     */
    void collectPaymentDetails();
}
