package com.huawei.builder;

public class withoutPattern {
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

    public static void main(String[] args) {
        Product product1 = new Product();
        product1.setName("aa");
        System.out.println("set name 之前进行逻辑校验");
        product1.setAge("14");
        System.out.println("set age 之前进行逻辑校验");
        product1.setLocation("北京");
        System.out.println("set location 之前进行逻辑校验");
    }
}
