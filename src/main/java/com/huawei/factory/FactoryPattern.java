package com.huawei.factory;

public class FactoryPattern {
    public static void main(String[] args) {
        Product1 product1 = ProductFactory.create();
        product1.execute();
    }
    interface ProductP{
        void execute();
    }

    public static class Product1 implements ProductP{
        @Override
        public void execute() {
            System.out.println("Product1 创建完成");
        }
    }

    public static class ProductFactory {
        public static Product1 create() {
            return new Product1();
        }
    }
}
