package iilibxc.strategy;

public enum Calculator {
    ADD{
        @Override
        public int exe(int a, int b) {
            return a + b;
        }

    },
    SUB{
        @Override
        public int exe(int a, int b) {
            return a - b;
        }

    };

    public abstract int exe(int a, int b);
}