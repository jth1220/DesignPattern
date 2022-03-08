package main.chainOfResponsibility;

public class ChainOfResponsibilityMain {

    /**
     * @param args
     */
    public static void main(String[] args) {
        RequestHandler handler1 = new ProjectMannager();
        RequestHandler handler2 = new Director();
        RequestHandler handler3 = new Manager();

        handler1.setNextHandler(handler2);
        handler2.setNextHandler(handler3);

        Request req1 = new Request("放假");
        Request req2 = new Request("等级");
        Request req3 = new Request("加薪");
        req3.setQuanlity(1000);

        handler1.handleRequest(req1);
        handler1.handleRequest(req2);
        handler1.handleRequest(req3);
    }

}
