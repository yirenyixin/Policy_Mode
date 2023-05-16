package com.example.policy_mode;

public class Strategy implements Istrategy {
    @Override
    public double Strategy01(double a) {//超出500部分
        return 500+(a-500)*0.95;
    }

    @Override
    public double Strategy02(double a) {//vip客户
        return a*0.9;
    }

    @Override
    public double Strategy03(double a) {//日用品
        return a*0.88;
    }
}
