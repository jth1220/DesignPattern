package main.chainOfResponsibility;

public class ProjectMannager extends RequestHandler {

    @Override
    public void handleRequest(Request que) {
        if (que.getType().equals("放假")) {
            System.out.println("项目经理同意放假");
        } else {
            System.out.println("项目经理说了不算，问主管");
            this.getNextHandler().handleRequest(que);
        }
    }
}
