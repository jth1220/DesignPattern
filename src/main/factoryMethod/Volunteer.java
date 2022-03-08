package main.factoryMethod;

public class Volunteer extends LeiFeng {
    @Override
    public void buyRice() {
        System.out.print("志愿者");
        super.buyRice();
    }
}
