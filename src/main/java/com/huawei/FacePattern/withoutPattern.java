package com.huawei.FacePattern;

public class withoutPattern {
    public static void main(String[] args) {
        DoSomething a = new A();
        DoSomething b = new B();
        DoSomething c = new C();
        a.execute();
        b.execute();
        c.execute();
    }

    static abstract class DoSomething {
        abstract void execute();
    }

    static class A extends DoSomething {

        @Override
        void execute() {
            System.out.println("A");
        }
    }

    static class B extends DoSomething {

        @Override
        void execute() {
            System.out.println("B");
        }
    }

    static class C extends DoSomething {

        @Override
        void execute() {
            System.out.println("C");
        }
    }
}
