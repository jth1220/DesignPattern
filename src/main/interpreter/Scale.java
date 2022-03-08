package main.interpreter;

public class Scale extends Expression {

    @Override
    public void excute(String key, double value) {
        String scale = null;
        int intKey = (int) value;
        if (intKey == 1) {
            scale = "低音";
        }
        if (intKey == 2) {
            scale = "中音";
        }
        if (intKey == 3) {
            scale = "高音";
        }

        System.out.print(" " + scale + " ");
    }

}
