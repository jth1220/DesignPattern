package main.visitor;

public class Success extends Action {

    @Override
    public void getManReflection(Man m) {
        System.out.println("当一个男的成功时，背后多半有一个伟大的女人");
    }

    @Override
    public void getWomanReaction(Woman w) {
        System.out.println("当一个女的成功时，背后多半有一个不成功的男人");
    }

}
