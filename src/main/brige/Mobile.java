package main.brige;

public abstract class Mobile {

    private MobileSoft soft;
    private String brand;

    public Mobile(String brand) {
        this.brand = brand;
    }

    public MobileSoft getSoft() {
        return soft;
    }

    public String getBrand() {
        return brand;
    }

    public void setSoft(MobileSoft soft) {
        this.soft = soft;
    }

    public abstract void run();
}
