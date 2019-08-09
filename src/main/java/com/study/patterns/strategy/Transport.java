package com.study.patterns.strategy;

/**
 * Created by Huzi on 2019/8/9.
 */
public abstract class Transport {

    //交通方式
    protected abstract String getName();

    //查询余额
    public abstract double queryBalance();

    //
    public String doTransport(String customerName, double cost) {
        if (queryBalance() < cost) {
            return "余额不足，不能乘坐";
        }
        return customerName + "乘坐" + getName() + "," + "费用：" + cost;
    }

}
