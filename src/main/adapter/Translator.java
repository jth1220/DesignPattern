package main.adapter;

public class Translator extends Player {
    private ForeignCenter wjzf;

    public Translator(String name) {
        wjzf = new ForeignCenter(name);
    }

    @Override
    public void attrack() {
        wjzf.jinggong();
    }

    @Override
    public void defence() {
        wjzf.fangshou();
    }
}
