package com.huawei.DesignPattern;

public class WithOutTemplateMethodDemo {
    public static void main(String[] args) {
        DiscountCalculator1 discountCalculator1 = new DiscountCalculator1();
        discountCalculator1.calculate();

        DiscountCalculator2 discountCalculator2 = new DiscountCalculator2();
        discountCalculator2.calculate();

        DiscountCalculator3 discountCalculator3 = new DiscountCalculator3();
        discountCalculator3.calculate();
    }

    public static class DiscountCalculator1 {
        public void calculate() {
            System.out.println("通用逻辑");
            System.out.println("优惠1的逻辑");
        }
    }

    public static class DiscountCalculator2 {
        public void calculate() {
            System.out.println("通用逻辑");
            System.out.println("优惠2的逻辑");
        }
    }

    public static class DiscountCalculator3 {
        public void calculate() {
            System.out.println("通用逻辑");
            System.out.println("优惠3的逻辑");
        }
    }
}
