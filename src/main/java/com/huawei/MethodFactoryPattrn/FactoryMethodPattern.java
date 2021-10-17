package com.huawei.MethodFactoryPattrn;

public class FactoryMethodPattern {
    public static void main(String[] args) {
       /*AbstractProductFactory f1 = new ProductOneFactory();
       AbstractProductFactory f2 = new ProductTwoFactory();
       AbstractProductFactory f3 = new ProductThreeFactory();
        Product product1 = f1.createProduct();
        Product product2 = f2.createProduct();
        Product product3 = f3.createProduct();
        product1.excute();
        product2.excute();
        product3.excute();*/
        ProductTwoFactory productTwoFactory = ProductTwoFactory.get();
        Product product = productTwoFactory.createProduct();
        product.excute();
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

    public static abstract class AbstractProductFactory {
        public  Product createProduct() {
            commonCreate();
            return specificCreate();
        }

        public  void commonCreate() {
            System.out.println("通用逻辑");
        }

        protected abstract Product specificCreate();
    }

    public static class ProductOneFactory extends AbstractProductFactory {
        @Override
        protected Product specificCreate() {
            System.out.println("产品1的特殊逻辑");
            return new Product1();
        }
    }

    public static class ProductTwoFactory extends AbstractProductFactory  {
        private ProductTwoFactory(){}

        private static final ProductTwoFactory instance = new ProductTwoFactory();

        public static ProductTwoFactory get() {
            return instance;
        }
        @Override
        protected Product specificCreate() {
            System.out.println("产品2的特殊逻辑");
            return new Product2();
        }
    }

    public static class ProductThreeFactory extends AbstractProductFactory  {
        @Override
        protected Product specificCreate() {
            System.out.println("产品1的特殊逻辑");
            return new Product3();
        }
    }
}
