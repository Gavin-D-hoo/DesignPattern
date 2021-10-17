package com.huawei.MethodFactoryPattrn;

import com.huawei.factory.FactoryPattern;

public class WithOutPattrn {
    public static void main(String[] args) {
        Product1 product1 = ProductOneFactory.create();
        Product2 product2 = ProductTwoFactory.create();
        Product3 product3 = ProductThreeFactory.create();
        product1.excute();
        product2.excute();
        product3.excute();
    }

    public interface Product {
        void excute();
    }

    public static class Product1 implements Product{
        @Override
        public void excute() {
            System.out.println("产品1的功能逻辑");
        }
    }

    public static class Product2 implements Product{
        @Override
        public void excute() {
            System.out.println("产品2的功能逻辑");
        }
    }

    public static class Product3 implements Product{
        @Override
        public void excute() {
            System.out.println("产品3的功能逻辑");
        }
    }

    public static class ProductOneFactory {
        public static Product1 create() {
            System.out.println("通用逻辑");
            System.out.println("产品1的特殊逻辑");
            return new Product1();
        }
    }

    public static class ProductTwoFactory {
        public static Product2 create() {
            System.out.println("通用逻辑");
            System.out.println("产品2的特殊逻辑");
            return new Product2();
        }
    }

    public static class ProductThreeFactory {
        public static Product3 create() {
            System.out.println("通用逻辑");
            System.out.println("产品1的特殊逻辑");
            return new Product3();
        }
    }
}
