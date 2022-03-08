package main.factoryMethod;

public class Graduate extends LeiFeng {
    @Override
    public void buyRice() {
        System.out.print("学生");
        super.buyRice();
    }
}
