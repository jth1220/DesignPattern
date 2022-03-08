package main.mediator;

public abstract class Country {

    private UnionNations mediator;

    public Country(UnionNations un) {
        this.mediator = un;
    }

    public UnionNations getMediator() {
        return mediator;
    }

    public void setMediator(UnionNations mediator) {
        this.mediator = mediator;
    }
}
