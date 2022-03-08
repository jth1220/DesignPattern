package main.mediator;

public class USA extends Country {

    public USA(UnionNations un) {
        super(un);
    }

    public void declare(String message) {
        this.getMediator().declare(message, this);
    }

    public void getMessage(String message) {
        System.out.println("美国得到了信息: " + message);
    }

}
