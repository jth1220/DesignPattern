package main.mediator;

public class MediatorMain {

    /**
     * @param args
     */
    public static void main(String[] args) {
        UnionNationsSecurityCouncil unsc = new UnionNationsSecurityCouncil();
        USA usa = new USA(unsc);
        Iraq iraq = new Iraq(unsc);

        unsc.setIraq(iraq);
        unsc.setUsa(usa);

        usa.declare("不准研制核武器");
        iraq.declare("我们没有核武器!");
    }

}
