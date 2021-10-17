package com.huawei.adapter;

public class WithOutAdapter {
    public static void main(String[] args) {
        /*OldInterfaceImpl oldInterface = new OldInterfaceImpl();
        oldInterface.oldExecute();
        NewInterfaceImpl newInterface = new NewInterfaceImpl();
        newInterface.newExecute();*/

        // 使用适配器模式之后调用方式
        NewInterfaceAdapter newInterfaceAdapter = new NewInterfaceAdapter(new OldInterfaceImpl());
        newInterfaceAdapter.newExecute();
        NewInterfaceImpl newInterface = new NewInterfaceImpl();
        newInterface.newExecute();
    }
    public static interface OldInterface {
        void oldExecute();
    }
    public static class OldInterfaceImpl implements  OldInterface {

        @Override
        public void oldExecute() {
            System.out.println("老版本借口实现类的功能逻辑");
        }
    }


    /**
     * 新版本接口
     */
    public static interface NewInterface {
        void newExecute();
    }

    /**
     * 新版本实现类
     */
    public static class NewInterfaceImpl implements NewInterface {

        @Override
        public void newExecute() {
            System.out.println("新版本接口实现类的功能逻辑");
        }
    }

    // 实用Adapter来进行优化处理
    public static class NewInterfaceAdapter implements NewInterface{
        private OldInterface oldInterface;

        public NewInterfaceAdapter(OldInterface oldInterface) {
            this.oldInterface = oldInterface;
        }

        @Override
        public void newExecute() {
            oldInterface.oldExecute();
        }
    }
}
