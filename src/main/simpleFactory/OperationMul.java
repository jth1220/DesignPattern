package main.simpleFactory;

public class OperationMul extends Operation {
    @Override
    public int getResult() {
        return a*b;
    }
}
