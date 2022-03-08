package main.chainOfResponsibility;

public class Manager extends RequestHandler {

    @Override
    public void handleRequest(Request que) {
        if (que.getType().equals("加薪")) {
            if(que.getQuanlity()<500){
                System.out.println("经理同意加薪");
            }else{
                System.out.println("再商量");
            }
        } else {
            System.out.println("再商量");
        }
    }

}
