package main.visitor;

public class Fail extends Action {

    @Override
    public void getManReflection(Man m) {
        System.out.println("当一个男的失败时");
    }

    @Override
    public void getWomanReaction(Woman w) {
        System.out.println("当一个女的失败时");
    }

}
