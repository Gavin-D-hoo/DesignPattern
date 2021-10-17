package com.huawei.statePattren状态模式;

public class StatePatternDemo {

    public static void main(String[] args) {
        Context context = new Context(new NewState());
        context.execute(1);
        context.execute(2);
        context.execute(3);
    }
    interface State {
        void execute();
    }

    public static class NewState implements State {
        @Override
        public void execute() {
            System.out.println("执行销售出库单新建状态的逻辑");
        }
    }

    public static class Approving implements State{
        @Override
        public void execute() {
            System.out.println("执行待审批状态的逻辑");
        }
    }

    public static class Approved implements State {
        @Override
        public void execute() {
            System.out.println("执行已审批状态的逻辑");
        }
    }

    public static class Finished implements State {
        @Override
        public void execute() {
            System.out.println("执行完成状态的逻辑");
        }
    }

    public static class Context {
        private State state;
        public Context (State state) {
            this.state = state;
            this.state.execute();
        }
        public void execute(int stateType) {
            if (stateType == 1) {
                Approving approving = new Approving();
                approving.execute();
            } else if (stateType == 2) {
                Approved approved = new Approved();
                approved.execute();
            } else if (stateType ==3) {
                Finished finished = new Finished();
                finished.execute();
            }
        }
    }
}