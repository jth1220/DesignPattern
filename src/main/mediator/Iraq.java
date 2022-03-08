package main.mediator;

public class Iraq extends Country {

    public Iraq(UnionNations un) {
        super(un);
    }

    public void declare(String message) {
        this.getMediator().declare(message, this);
    }

    public void getMessage(String message) {
        System.out.println("伊拉克得到了信息: " + message);
    }

}
