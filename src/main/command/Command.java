package main.command;

public abstract class Command {

    private Barbecuer receiver;

    public Command(Barbecuer receiver) {
        this.receiver = receiver;
    }

    public abstract void excuteCommand();

    public Barbecuer getBarbecuer() {
        return receiver;
    }

    public void setBarbecuer(Barbecuer barbecuer) {
        this.receiver = barbecuer;
    }
}
