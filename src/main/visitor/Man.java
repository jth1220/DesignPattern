package main.visitor;

public class Man extends Person {

    @Override
    public void accept(Action visitor) {
        visitor.getManReflection(this);
    }

}
