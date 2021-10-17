package com.huawei.builder;

public class OptimizedBuilderPattern {
    public static void main(String[] args) {
        ConcreteBuilder concreteBuilder = new ConcreteBuilder();
        Product product = concreteBuilder
                .setAgrs1("n")
                .setAgrs2("2")
                .setAgrs3("asa").create();
    }
    public static class Product {
        private String name;
        private String age;
        private String location;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAge() {
            return age;
        }

        public void setAge(String age) {
            this.age = age;
        }

        public String getLocation() {
            return location;
        }

        public void setLocation(String location) {
            this.location = location;
        }

        @Override
        public String toString() {
            return "Product{" +
                    "name='" + name + '\'' +
                    ", age='" + age + '\'' +
                    ", location='" + location + '\'' +
                    '}';
        }
    }
    public interface Builder {
        Builder setAgrs1(String name);
        Builder setAgrs2(String age);
        Builder setAgrs3(String location);
        Product create();
    }
    public static class ConcreteBuilder implements Builder {
        private Product product = new Product();
        @Override
        public Builder setAgrs1(String name) {
            System.out.println("set name 之前进行逻辑校验");
            product.setName(name);
            return this;
        }

        @Override
        public Builder setAgrs2(String age) {
            System.out.println("set age 之前进行逻辑校验");
            product.setName(age);
            return this;
        }

        @Override
        public Builder setAgrs3(String location) {
            System.out.println("set location 之前进行逻辑校验");
            product.setName(location);
            return this;
        }

        @Override
        public Product create() {
            return product;
        }
    }
}
