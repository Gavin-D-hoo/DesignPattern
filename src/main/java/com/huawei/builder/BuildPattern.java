package com.huawei.builder;

public class BuildPattern {
    public static void main(String[] args) {
    Director director = new Director(new ConcreteBuilder());
        System.out.println(director.build("小明食品", "29", "北二环"));

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
        void setAgrs1(String name);
        void setAgrs2(String age);
        void setAgrs3(String location);
        Product create();
    }
    public static class ConcreteBuilder implements Builder {
        private Product product = new Product();
        @Override
        public void setAgrs1(String name) {
            System.out.println("set name 之前进行逻辑校验");
            product.setName(name);
        }

        @Override
        public void setAgrs2(String age) {
            System.out.println("set age 之前进行逻辑校验");
            product.setName(age);
        }

        @Override
        public void setAgrs3(String location) {
            System.out.println("set location 之前进行逻辑校验");
            product.setName(location);
        }

        @Override
        public Product create() {
            return product;
        }
    }

    public static class Director {
        private Builder builder;
        public Director (Builder builder) {
            this.builder = builder;
        }
        public Product build(String name, String age, String location) {
            builder.setAgrs1(name);
            builder.setAgrs2(age);
            builder.setAgrs3(location);
            return builder.create();
        }
    }
}
