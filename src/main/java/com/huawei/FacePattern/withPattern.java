package com.huawei.FacePattern;

public class withPattern {
    public static void main(String[] args) {
        SystemA systemA = new SystemA();
        systemA.excute();
    }
    static class SystemA {
        public void excute() {
            A a = new A();
            B b = new B();
            C c = new C();
            a.execute();
            b.execute();
            c.execute();
        }
    }

    static abstract class DoSomething {
        abstract void execute();
    }

    static class A extends withoutPattern.DoSomething {

        @Override
        void execute() {
            System.out.println("A");
        }
    }

    static class B extends withoutPattern.DoSomething {

        @Override
        void execute() {
            System.out.println("B");
        }
    }

    static class C extends withoutPattern.DoSomething {

        @Override
        void execute() {
            System.out.println("C");
        }
    }
}
