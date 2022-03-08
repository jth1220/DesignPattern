package main.composite;

public class FinanceDepartment extends Company {

    public FinanceDepartment(String name) {
        super(name);
    }

    @Override
    public void add(Company c) {

    }

    @Override
    public void display(int depth) {
        System.out.println("-" + this.getName());
    }

    @Override
    public void lineOfDuty() {
        System.out.println(this.getName() + "管钱");
    }

    @Override
    public void remove(Company c) {
    }

}
