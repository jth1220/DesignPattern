package main.adapter;

public class Guard extends Player {

    public Guard(String name) {
        this.setName(name);
    }

    @Override
    public void attrack() {
        System.out.println(this.getName() + " attrack");
    }

    @Override
    public void defence() {
        System.out.println(this.getName() + " defence");
    }
}
