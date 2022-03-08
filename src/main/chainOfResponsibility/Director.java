package main.chainOfResponsibility;

public class Director extends RequestHandler {

    @Override
    public void handleRequest(Request que) {
        if (que.getType().equals("等级")) {
            System.out.println("同意加等级");
        } else {
            System.out.println("主管说了不算，问老板");
            this.getNextHandler().handleRequest(que);
        }
    }

}
