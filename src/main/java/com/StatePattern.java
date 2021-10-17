package com;

public class StatePattern {
    public static void main(String[] args) {
        Context context = new Context(new initStates());
        context.execute(1);
        context.execute(2);
        context.execute(3);
    }

    /**
     * 状态接口，里面包含一个execute方法，将每一个步骤具体实现方式交给实现类来完成
     */
    interface State {
        void execute();
    }

    /**
     * 负责初始化流程的类
     */
    public static class initStates implements State {
        @Override
        public void execute() {
            System.out.println("初始化状态");
        }
    }

    /**
     * 负责第一步流程的类
     */
    public static class FirstStates implements State {
        @Override
        public void execute() {
            System.out.println("状态一");
        }
    }

    /**
     * 负责第二步流程的类
     */
    public static class SecondStates implements State {
        @Override
        public void execute() {
            System.out.println("状态二");
        }
    }

    /**
     * 负责第三步（完成状态）流程的类
     */
    public static class ThreeStates implements State {
        @Override
        public void execute() {
            System.out.println("完成状态");
        }
    }

    /**
     * 负责整个流程掌控的类，后续和流程相关的操作直接由该类来负责
     */
    public static class Context {

        private State state;
        // 只要是初始化Context接口 就意味着第一步已经做完了 所以要调用时传入iinitStates并且调用xecute方法
        public Context(State state) {
            this.state = state;
            state.execute();
        }

        // 每一次对于当前步骤的tips来进行流程把控
        public void execute(int state) {
            if (state == 1) {
                FirstStates firstStates = new FirstStates();
                firstStates.execute();
            } else if (state == 2) {
                SecondStates secondStates = new SecondStates();
                secondStates.execute();
            } else if (state == 3) {
                ThreeStates threeStates = new ThreeStates();
                threeStates.execute();
            }
        }
    }
}