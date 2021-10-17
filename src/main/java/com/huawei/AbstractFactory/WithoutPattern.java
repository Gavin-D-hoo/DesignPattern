package com.huawei.AbstractFactory;

import com.huawei.MethodFactoryPattrn.FactoryMethodPattern;

public class WithoutPattern {
    public static void main(String[] args) {
        Product1 product1 = new Product1();
    }
    public interface Product {
        void excute();
    }

    public static class Product1 implements FactoryMethodPattern.Product {
        @Override
        public void excute() {
            System.out.println("产品1的功能逻辑");
        }
    }

    public static class Product2 implements FactoryMethodPattern.Product {
        @Override
        public void excute() {
            System.out.println("产品2的功能逻辑");
        }
    }
}
