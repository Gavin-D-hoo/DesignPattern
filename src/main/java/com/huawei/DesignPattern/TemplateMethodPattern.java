package com.huawei.DesignPattern;

public class TemplateMethodPattern {
    public static void main(String[] args) {
        TemplateMethodImpl d1 = new DiscountCalculator1();
        d1.uniqueCalculate();
        d1.calculate();
        TemplateMethodImpl d2 = new DiscountCalculator2();
        d2.uniqueCalculate();
        d2.calculate();
        TemplateMethodImpl d3 = new DiscountCalculator3();
        d3.uniqueCalculate();
        d2.calculate();
    }
    public interface Discount {
        void calculate();
    }

    public static abstract class TemplateMethodImpl implements Discount {
        public void normalCalculate() {
            System.out.println("通用方法");
        }

        public abstract void uniqueCalculate();

        @Override
        public void calculate() {
            normalCalculate();
        }
    }

    public static class DiscountCalculator1 extends TemplateMethodImpl {

        @Override
        public void uniqueCalculate() {
            System.out.println("优惠1的逻辑");
        }
    }

    public static class DiscountCalculator2 extends TemplateMethodImpl{
        @Override
        public void uniqueCalculate() {
            System.out.println("优惠2的逻辑");
        }
    }

    public static class DiscountCalculator3 extends TemplateMethodImpl{
        @Override
        public void uniqueCalculate() {
            System.out.println("优惠3的逻辑");
        }
    }
}
