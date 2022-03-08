package main.proxy;

public class Pursuit implements GiveGift {
    SchoolGirl mm;

    public Pursuit(SchoolGirl mm) {
        this.mm = mm;
    }

    @Override
    public void giveChocolate() {
        System.out.println(mm.getName() + "give you a chocolate");
    }

    @Override
    public void giveDolls() {
        System.out.println(mm.getName() + "give you a doll");
    }

    @Override
    public void giveFlowers() {
        System.out.println(mm.getName() + "give you a Flower");
    }

}
