package main.simpleFactory;

public class OperationSub extends Operation {
    @Override
    public int getResult() {
        return a - b;
    }
}
